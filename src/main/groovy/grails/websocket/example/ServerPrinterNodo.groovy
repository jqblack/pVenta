package grails.websocket.example

import FuncionesGenerales.Funciones;
import grails.converters.JSON;
import grails.util.Environment
import manube_v2.ConfiguracionService
import manube_v2.SqlService
import org.apache.commons.logging.LogFactory
import javax.servlet.ServletContext
import javax.servlet.ServletContextEvent
import javax.servlet.ServletContextListener
import javax.servlet.annotation.WebListener
import javax.websocket.OnClose
import javax.websocket.OnError
import javax.websocket.OnMessage
import javax.websocket.OnOpen
import javax.websocket.Session
import javax.websocket.server.ServerContainer
import javax.websocket.server.ServerEndpoint
import org.grails.web.util.GrailsApplicationAttributes as GA
import org.slf4j.Logger
import org.slf4j.LoggerFactory

@WebListener
@ServerEndpoint("/annotated")
public class ServerPrinterNodo implements ServletContextListener {
	
	private final Logger log = LoggerFactory.getLogger(getClass().name);
	private static final Logger log1 = LoggerFactory.getLogger(getClass().name);
    def log4j = LogFactory.getLog("menube."+this.getClass().getName());
    def  static log4j_estatico = LogFactory.getLog("menube."+this.getClass().getName());

    private static Session startSession;

    private static List<Session> sesiones = new ArrayList<Session>();

    @Override
    public void contextInitialized(ServletContextEvent event) {

        ServletContext servletContext = event.servletContext;
		final ServerContainer serverContainer = servletContext.getAttribute("javax.websocket.server.ServerContainer")
		try {
			if (Environment.current == Environment.DEVELOPMENT) {
				serverContainer.addEndpoint(ServerPrinterNodo)	;
			}
            def ctx = servletContext.getAttribute(GA.APPLICATION_CONTEXT);
//			def grailsApplication = ctx.grailsApplication;
//			def config = grailsApplication.config;
//			int defaultMaxSessionIdleTimeout = config.myservletcontext.timeout ?: 0;
//            println("tiempo ->> "+defaultMaxSessionIdleTimeout.toString());
			serverContainer.defaultMaxSessionIdleTimeout = 0;
//			serverContainer.defaultMaxSessionIdleTimeout = defaultMaxSessionIdleTimeout;
//			serverContainer.defaultMaxSessionIdleTimeout = -1;

		}
		catch (IOException e) {
			log.error e.message, e
		}
	}
	

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
    }
    @OnOpen
	public void handleOpen(Session userSession) {
        Funciones funciones= new Funciones();
        startSession = userSession;
        try {
            println("Client is now connected. ${userSession.getId().toString()} ");
        }catch (Exception a )
        {
            log4j.info("evento @OnOpen ---:> "+a.getMessage())
        }
    }
	@OnMessage
	public void handleMessage(String message,Session session) {


        if (message.equals("3"))
        {
            session.getBasicRemote().sendText("OK");
        }else if(message.equals("4")){
            session.getBasicRemote().sendText("OK1");
        }
        else {
            try {

                Funciones funciones = new Funciones();
                SqlService sqlService =Funciones.getClass(SqlService);
                ConfiguracionService service = Funciones.getClass(ConfiguracionService);

                def decodificado = new String(message.decodeBase64());
                def string=new String(decodificado);
                def json=JSON.parse(string);
                if (json.getAt("f_key")=='1')
                {
                    String data=json.getAt("f_data");
                    def tupla=JSON.parse(data);
                    Map p = sqlService.GetQueryMap("select * from t_printers_nodo where f_pass = '${tupla.getAt("f_pass").toString()}' and f_usuario = '${tupla.getAt("f_user").toString()}'");
                    if (!p.isEmpty())
                    {
                        String id = sqlService.Get_preinter_session_id(session.toString());
                        session.setMaxIdleTimeout(86400000);
                        /*****************Registro la session en la lista ********************/
                        sesiones.add(session);
                        /*******************Buscamos las facturas pendientes de impresion*********************/
                        List pendientes = sqlService.GetQuery("select eliminar_facturas_reimprecion(f_idrecord) as f_hiden,f_idrecord,f_idsession,f_factura,f_fecha,f_idempresa from public.t_facturas_impresion_pendiente as f where f.f_idsession ='${tupla.getAt("f_idserver").toString()}' and f.f_idempresa=${p.f_idempresa.toString()}");
                        String [] campos=["f_idserver","f_facturas"];
                        String json_facturas="[]";

                        if (pendientes.size()>0)
                        {
                            json_facturas = (pendientes as JSON).toString();
                        }
                        /*******************LLenamos los valores para el JSON de Respuesta al cliente del printer******************************/
                        String [] valore=["$id","${json_facturas}"];
                        String json_mensaje = convertir('1','"'+funciones.crearJSON(campos,valore)+'"').replace("'", '"').replace('"[','[').replace(']"',']').replace('"f_data":"','"f_data":').replace(']}"}',']}}');
                        session.getBasicRemote().sendText(json_mensaje);
                    }
                    else
                    {
                        String json_mensaje = convertir('-1','"Usuario No valido"');
                        session.getBasicRemote().sendText(json_mensaje);
                        session.close();
                    }
                }
                if(json.getAt("f_key")=='2')
                {
                    String data=json.getAt("f_data");
                    def tupla=JSON.parse(data);

                    /*****************Elimino la session en la lista ********************/
                    println tupla.getAt("f_idserver").toString()
                    Map tprinterSession = sqlService.GetQueryMap("select * from t_printer_session where f_id_client_printer = '${tupla.getAt("f_idserver").toString()}'")
                    if (!tprinterSession.isEmpty())
                    {
                        for (Session s : sesiones)
                        {
                            if(s.toString()==tprinterSession.f_seccion.toString())
                            {
//                                service.DeleteSessionPrinter(s.toString());
                                service.DeleteSessionPrinterById(tupla.getAt("f_idserver").toString());
                            }
                        }
                    }
                    service.InsertSessionPrinter(session.toString(),tupla.getAt("f_idserver").toString());
                    /*****************Registro la session en la lista ********************/
                    sesiones.add(session);
                    List pendientes = sqlService.GetQuery("select eliminar_facturas_reimprecion(f_idrecord) as f_hiden,f_idrecord,f_idsession,f_factura,f_fecha,f_idempresa from public.t_facturas_impresion_pendiente as f where f.f_idsession ='${tupla.getAt("f_idserver").toString()}'");
                    String [] campos=["f_idserver","f_facturas"];
                    String json_facturas="[]";

                    if (pendientes.size()>0)
                    {
                        json_facturas = (pendientes as JSON).toString();
                    }
                    
                    String [] valore=["${tupla.getAt("f_idserver").toString()}","${json_facturas}"];
                    String json_mensaje = convertir('1','"'+funciones.crearJSON(campos,valore)+'"').replace("'", '"').replace('"[','[').replace(']"',']').replace('"f_data":"','"f_data":').replace(']}"}',']}}');
                    session.getBasicRemote().sendText(json_mensaje);
                }
            }
            catch (Exception a)
            {
                println(a.getMessage());
            }
        }
    }
    public static void enviar(String mensaje,String id_session)
    {
        Funciones funciones = new Funciones();
        SqlService sqlService = Funciones.getClass(SqlService);

        Session session = null;
        try {
            List tprinterSession = sqlService.getQuery("select * from t_printer_session where f_id_client_printer = '${id_session}'")

            if (tprinterSession.size() > 0) {

                for (Session s : sesiones) {
                    tprinterSession.each { item ->
                        if (s.toString() == item.t_seccion.toString()) {
                            println item.t_seccion.toString()
                            session = s;
                        }
                    }
                }

                mensaje = mensaje.encodeAsBase64();
                String json_mensaje = "{${'"f_key"'}:${'"2"'},${'"f_data"'}:${'"' + mensaje + '"'}}";
                session.getBasicRemote().sendText(json_mensaje);
            }

        }
        catch (Exception e) {
            ConfiguracionService service = Funciones.getClass(ConfiguracionService);
            service.crearFacturasPendientes(id_session, mensaje);
            service.DeleteSessionPrinter(session.toString())
            log1.error e.message, e
        }
    }
    public static void enviar(String mensaje)
    {
        try {
            mensaje = mensaje.encodeAsBase64();
            String json_mensaje = "{${'"f_key"'}:${'"2"'},${'"f_data"'}:${'"' + mensaje + '"'}}";
            startSession.getBasicRemote().sendText(json_mensaje);
        }
        catch (Exception e) {
            println(e.getMessage())
        }
    }
	@OnClose
	public void handeClose(Session session) {
        try
        {
            ConfiguracionService service = Funciones.getClass(ConfiguracionService);
            service.DeleteSessionPrinter(session.toString());
        }
        catch (Exception e)
        {
            println(e.getMessage())
        }

	}
	@OnError
	public void handleError(Throwable t) {

        try
        {
            t.printStackTrace();
        }
        catch (Exception a)
        {
            println(a.getMessage())
        }

	}

    def String convertir(String key,String data)
    {
        String json="{${'"f_key"'}:${'"'+key+'"'},${'"f_data"'}:$data}";
        return json;
    }


}
