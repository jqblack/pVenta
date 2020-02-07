package com.example.demo.Servicios

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

import java.sql.Timestamp


@Service
@Transactional
class SqlServices {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Transactional
    def getQuery(String sql){
        try{
            return jdbcTemplate.queryForList(sql);
        }catch(Exception e){
            println e.getStackTrace();
        }
    }
    @Transactional
    List getQuery(String sql,Object [] parametros){
        try{
            return jdbcTemplate.queryForList(sql,parametros);
        }catch(Exception e){
           println e.getStackTrace();
        }
    }
    @Transactional
    Map getQueryMap(String sql,Object [] parametros){
        try{
            return jdbcTemplate.queryForMap(sql,parametros);
        }catch(Exception e){
            e.printStackTrace()
            return  [:];
        }
    }
    @Transactional
    def ejecutarQuery(String sql,Object [] parametros){
        try{
            return jdbcTemplate.update(sql,parametros);
        }catch(Exception e){
             e.printStackTrace();
        }
    }
    @Transactional
    def getQueryForObject(String sql,Class clase){
        try{
            return jdbcTemplate.queryForObject(sql,clase);
        }catch(Exception e){
            return ""
        }
    }

    def GetNow(){
        return jdbcTemplate.queryForObject("Select now()::timestamp", Timestamp.class);
    }
    def  Integer GetSecuencia(String tipodocumento,Long empresa)
    {
        Integer a=jdbcTemplate.queryForObject("select get_secuencia('$tipodocumento',false,$empresa)",Integer.class);
        return a.toInteger();
    }

    Long GetIdComanda()
    {
        Long  a=jdbcTemplate.queryForObject("SELECT nextval('idcomanda'::regclass)",Long.class);
        return a;
    }

    def GetDiaSemana(Long tipo_en_string_o_numero)
    {
        Calendar now = Calendar.getInstance();

        String[] strDays = ["Domingo",
                            "Lunes",
                            "Martes",
                            "Miercoles",
                            "Jueves",
                            "Viernes",
                            "Sabado"];

        if (tipo_en_string_o_numero == 1.toLong())
        {
            return strDays[now.get(Calendar.DAY_OF_WEEK) - 1];

        }else if (tipo_en_string_o_numero ==2.toLong())
        {
            return (now.get(Calendar.DAY_OF_WEEK) - 1).toString()
        }
    }
    def  String Get_Secuencia_Ncf(Integer numero)
    {
        String a=jdbcTemplate.queryForObject("select get_secuencia_ncf('$numero')",String.class);
        return a.toString();
    }



    def BeginWork(sql)
    {
        jdbcTemplate.execute(sql);
    }

    def BeginWork()
    {
        jdbcTemplate.execute("BEGIN WORK;");
    }

    def CommitWork(sql)
    {
        jdbcTemplate.execute(sql);
    }
    def CommitWork()
    {
        jdbcTemplate.execute("COMMIT WORK ");
    }

}
