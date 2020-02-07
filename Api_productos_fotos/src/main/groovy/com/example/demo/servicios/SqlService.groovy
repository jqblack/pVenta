package com.example.demo.servicios

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.stereotype.Repository
import org.springframework.transaction.annotation.Transactional

import java.sql.Timestamp

@Transactional
@Repository
class SqlService {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Transactional
    def GetQuery(String sql)
    {
        return jdbcTemplate.queryForList(sql);
    }
    @Transactional
    def GetQuery(String sql,Collection parametros)
    {
        return jdbcTemplate.queryForList(sql,parametros.toArray());
    }
    @Transactional
    def GetQueryMap(String sql,Collection parametros)
    {
        try{
            return jdbcTemplate.queryForMap(sql,parametros.toArray());
        }catch(Exception e){
            e.printStackTrace()
            return [:]
        }
    }
    @Transactional
    def GetQueryForObject(String sql,Class clase){
        return jdbcTemplate.queryForObject(sql,clase);
    }
    @Transactional
    def EjecutarQuery(String sql,Collection parametros){

        try{
            return jdbcTemplate.update(sql,parametros.toArray());
        }catch(Exception e){
            e.printStackTrace();
            return [:]
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
