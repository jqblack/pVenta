package com.example.demo.FuncionesGenrales

import java.security.MessageDigest

class Funciones {

    def encodeAsMD5(String dato)
    {
        MessageDigest md5 = MessageDigest.getInstance('MD5');
        md5.update(dato.getBytes());
        BigInteger hash = new BigInteger(1, md5.digest());
        String hashFromContent = hash.toString(16);
        return hashFromContent;
    }
    def String crearJSON(String [] campos ,String [] datos)
    {
        String json ;
        json = "{";
        for (int i = 0; i < campos.size() ; i++) {
            json = json + "'${campos[i]}'";
            json = json + ":";
            json = json + "'${datos[i]}'";
            if (i < campos.size() - 1)
            {
                json = json + ",";
            }
        }
        json = json + "}";
        return json.toString();
    }
    def String convertir(String key, String data) {
        String json = "{'f_key':'$key','f_data':$data}";
        return json;
    }

}
