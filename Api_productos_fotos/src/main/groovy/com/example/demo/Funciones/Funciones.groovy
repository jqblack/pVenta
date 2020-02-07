package com.example.demo.Funciones

import groovy.json.JsonOutput

import java.security.MessageDigest
import java.text.SimpleDateFormat

class Funciones {

    Boolean CheckToken(Map mapa){

        if (mapa.get("f_key").toString().equals(encodeAsMD5().toUpperCase())){
            return true;
        }
        else{
            return false;
        }
    }

    String encodeAsMD5()
    {
        String fecha = formatDate(new Date(),"MM/dd/yyyy");
        String dato = "solomujeresamericanas@"+fecha;

        MessageDigest md5 = MessageDigest.getInstance('MD5');
        md5.update(dato.getBytes());
        BigInteger hash = new BigInteger(1, md5.digest());
        String hashFromContent = hash.toString(16);
        return hashFromContent;
    }

    String formatDate(Date fecha,String formato){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(formato);
        return simpleDateFormat.format(fecha);
    }

    String convertir(String key,Object data){
        Map mapa = new HashMap();
        mapa.put("f_key",key);
        mapa.put("f_data",data);
        String response = JsonOutput.toJson(mapa);
        return response.getBytes().encodeBase64().toString();
    }
}
