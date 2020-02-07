package com.aplicacion.menube_app_server.servicios

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

import java.sql.Timestamp

@Transactional
@Service
class SqlService {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Transactional
    def GetQuery(String sql)
    {
        return jdbcTemplate.queryForList(sql);
    }
    @Transactional
    def GetQuery(String sql,Object [] parametros)
    {
        return jdbcTemplate.queryForList(sql,parametros);
    }
    @Transactional
    def GetQueryMap(String sql,Object [] parametros)
    {
        try{
            return jdbcTemplate.queryForMap(sql,parametros);
        }catch(Exception e){
            return [:]
        }
    }
    @Transactional
    def GetQueryForObject(String sql,Class clase){
        return jdbcTemplate.queryForObject(sql,clase);
    }
    @Transactional
    def EjecutarQuery(String sql,Object [] parametros){
        return jdbcTemplate.update(sql,parametros);
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

    @Transactional
    def getProductosFavoritos(String sql){
        try{
            return jdbcTemplate.queryForList(sql);
        }catch(Exception e){
            return Collections.EMPTY_LIST;
        }
    }

    @Transactional
    def addProductosFavoritos(String sql){
        try{
            jdbcTemplate.execute(sql);
            return true;
        }catch(Exception e){
            return false
        }
    }

    @Transactional
    String deleteProducto(String sql){
        try{
            jdbcTemplate.execute(sql);
            return "1";
        }catch(Exception e){
            return "0";
        }
    }
    @Transactional
    def SearchMap(String sql){
        try{
           return jdbcTemplate.queryForMap(sql);
        }catch(Exception e){
            return Collections.EMPTY_MAP;
        }
    }

}
