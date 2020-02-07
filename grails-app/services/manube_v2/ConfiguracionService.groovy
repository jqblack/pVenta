package manube_v2

import FuncionesGenerales.Funciones
import grails.gorm.transactions.Transactional
import groovy.transform.CompileStatic
import org.apache.commons.logging.LogFactory

@CompileStatic
class ConfiguracionService {

    SqlService sqlService;
    def DeleteSessionPrinter(String session)
    {
        def log4j = LogFactory.getLog(this.getClass().getName());
        try {
            String sql ="delete from public.t_printer_session as t where t.t_seccion='$session'";
            sqlService.EjecutarSql(sql);

        }catch (Exception a)
        {
//            log4j.info("Evento en guardar la session en la base de datos --:> "+a.toString());
        }
    }

    def DeleteSessionPrinterById(String id)
    {
        def log4j = LogFactory.getLog(this.getClass().getName());
        try {
            String sql ="delete from public.t_printer_session as t where t.f_id_client_printer='$id'";
            sqlService.EjecutarSql(sql);

        }catch (Exception a)
        {
//            log4j.info("Evento en guardar la session en la base de datos --:> "+a.toString());
        }
    }

    def InsertSessionPrinter(String session,String idcliente)
    {

        def log4j = LogFactory.getLog(this.getClass().getName());
        try {
            String sql="INSERT INTO \n" +
                    "  public.t_printer_session\n" +
                    "(\n" +
                    "  f_id_client_printer,\n" +
                    "  t_seccion,\n" +
                    "  f_fecha\n" +
                    ")\n" +
                    "VALUES (\n" +
                    "  '$idcliente',\n" +
                    "  '$session',\n" +
                    "  now()::timestamp\n" +
                    ");"


            sqlService.EjecutarSql(sql);
        }catch (Exception a)
        {
//            log4j.info("Evento en guardar la session en la base de datos --:> "+a.toString());
        }
    }

    def crearFacturasPendientes(String IDvalue, String factura) {


        SqlService sqlService = Funciones.getClass(SqlService);
//
//        TfacturasImpresionPendiente a = new TfacturasImpresionPendiente(fIdempresa: empresa.id, fFecha: sqlService.GetNow(), fFactura: factura, fIdsession: IDvalue);
//        a.save(failOnError: true);
        sqlService.EjecutarSql("insert into t_facturas_impresion_pendiente (f_idempresa,f_fecha,f_factura,f_idsession)values (0,now(),'${factura}','${IDvalue}')")

    }

    def serviceMethod() {

    }

}
