package com.example.demo.Servicios

import com.example.demo.FuncionesGenrales.Funciones
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional


@Service
class SeguridadService {
    @Autowired
    JdbcTemplate jdbcTemplate;
    @Autowired
    SqlServices sqlServices;


    @Transactional
    List getUsuariosPuntoVenta(String usuario,String contaseña,Integer Empresa)
    {
        Funciones funciones = new Funciones();
        Object [] params = [Empresa.toLong()] as Object;
        Map empresa = sqlServices.getQueryMap("SELECT  * from cfg.t_empresas b where  b.f_idrecord = ?",params);


        contaseña=funciones.encodeAsMD5(contaseña);
        if (empresa.isEmpty())
        {
            return null;
        }
        params = [
                empresa.f_idrecord.toString().toLong(),
                usuario,
                contaseña,
                true
        ] as Object
        String sql=" SELECT * from t_usuarios as b where b.f_idempresa = ? and  b.f_username = ? and b.f_password = ? and b.f_activo = ?" ;
        List tusuario = sqlServices.getQuery(sql,params);
        return tusuario;
    }

    @Transactional
    def InsertarLogin(String token,String  usuario,Long idempresa,String modelo,String banda,String operadora,BigDecimal tamano,String emei){


        try {
            String sql = "INSERT INTO \n" +
                    "  web.t_login\n" +
                    "(\n" +
                    "  f_usuario,\n" +
                    "  f_token,\n" +
                    "  f_fecha,\n" +
                    "  f_idempresa,\n" +
                    "  f_modelo,\n" +
                    "  f_banda,\n" +
                    "  f_operadora,\n" +
                    "  f_tamano,\n" +
                    "  f_imei,\n" +
                    "  f_activo,\n" +
                    "  f_fecha_ultima_session\n" +
                    "\n" +
                    ")\n" +
                    "VALUES (?,?,?,?,?,?,?,?,?,?,?); ";

            Object [] params = [
                    usuario,
                    token,
                    sqlServices.GetNow(),
                    idempresa,
                    modelo,
                    banda,
                    operadora,
                    tamano,
                    emei,
                    true,
                    sqlServices.GetNow()
            ] as Object;

            sqlServices.ejecutarQuery(sql, params);
        }catch(Exception e){

            println "Error Insertando el dato en la tabla login ==> " + e.getMessage();
        }
    }

    def ValidarNcf(Long id, Long empresa) {
        String valor = "1";
        Object [] params = [id,empresa] as Object
        Map  tncf = sqlServices.getQueryMap("select * from t_ncf b where b.f_idrecord = ? and b.f_idempresa = ? ;",params)
        params = [id,empresa,true] as Object
        Map logs =sqlServices.getQueryMap("select * from t_logs_ncf b where b.f_tipo_ncf = ? and b.f_idempresa = ? and b.f_activo = ?;",params)

        if (!tncf.isEmpty()) {
            if (!logs.isEmpty()){
                if (tncf.f_valida_fecha_vigencia.toString().toBoolean()) {
                    if ((logs.f_fecha_final as Date) < new Date()) {
                        valor = "-1";
                    }
                }
            }else {
                valor = "-1";
            }
            if (tncf.f_valida_rnc.toString().toBoolean()){
                valor +="#-1";
            }else {
                valor+="#1";
            }
        }


        return valor;
    }



}
