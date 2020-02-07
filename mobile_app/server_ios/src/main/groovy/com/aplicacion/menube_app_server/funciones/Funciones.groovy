package com.aplicacion.menube_app_server.funciones

import com.fasterxml.jackson.databind.ObjectMapper
import grails.converters.JSON

import javax.imageio.ImageIO
import java.awt.Graphics2D
import java.awt.RenderingHints
import java.awt.image.BufferedImage
import java.security.MessageDigest

class Funciones  {


    def String crearJSON(String [] campos ,String [] datos)
    {
        String json ;
        json = "{";

        for (int i = 0; i < campos.size() ; i++) {
            json = json + "\"${campos[i]}\"";
            json = json + ":";
            json = json + "\"${datos[i]}\"";
            if (i < campos.size() - 1)
            {
                json = json + ",";
            }
        }
        json = json + "}";
        return json.toString();
    }
    def String convertir(String key, String data) {
        String json = "{\"f_key\":\"$key\",\"f_data\":$data}";
        return json.getBytes().encodeBase64();
    }


    def ListToJson(List list)  {
        if (list.size()> 0)
        {
            final ByteArrayOutputStream out = new ByteArrayOutputStream();
            final ObjectMapper mapper = new ObjectMapper();
            mapper.writeValue(out, list);
            final byte[] data = out.toByteArray();
            return new String(data);

        }else{
            return "[]"
        }

    }

    def MapToJson(Map map){
        if (!map.isEmpty())
        {
          return  new ObjectMapper().writeValueAsString(map);
        }else{
            return "{}"
        }

    }

    def encodeAsMD5(String dato)
    {
        MessageDigest md5 = MessageDigest.getInstance('MD5');
        md5.update(dato.getBytes());
        BigInteger hash = new BigInteger(1, md5.digest());
        String hashFromContent = hash.toString(16);
        return hashFromContent;
    }

    def ReducirAumentarImagen(File file,int MAX_WIDTH, int MAX_HEIGHT) {


        BufferedImage bimage = loadImage(file);
        if(bimage.getHeight()>bimage.getWidth()){
            int heigt = (bimage.getHeight() * MAX_WIDTH) / bimage.getWidth();
            bimage = resize(bimage, MAX_WIDTH, heigt);
            int width = (bimage.getWidth() * MAX_HEIGHT) / bimage.getHeight();
            bimage = resize(bimage, width, MAX_HEIGHT);
        }else{
            int width = (bimage.getWidth() * MAX_HEIGHT) / bimage.getHeight();
            bimage = resize(bimage, width, MAX_HEIGHT);
            int heigt = (bimage.getHeight() * MAX_WIDTH) / bimage.getWidth();
            bimage = resize(bimage, MAX_WIDTH, heigt);
        }
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ImageIO.write(bimage, "jpg", baos);
        byte[] bytes_foto = baos.toByteArray();
        return bytes_foto;
    }
    public static BufferedImage resize(BufferedImage bufferedImage, int newW, int newH) {
        int w = bufferedImage.getWidth();
        int h = bufferedImage.getHeight();
        BufferedImage bufim = new BufferedImage(newW, newH, bufferedImage.getType());
        Graphics2D g = bufim.createGraphics();
        g.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g.drawImage(bufferedImage, 0, 0, newW, newH, 0, 0, w, h, null);
        g.dispose();
        return bufim;
    }

    public static BufferedImage loadImage(File file) {
        BufferedImage bimage = null;
        try {
            bimage = ImageIO.read(file);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bimage;
    }

    def distanciaCoord(double lat1, double lng1, double lat2, double lng2) {
        //double radioTierra = 3958.75;//en millas
        double radioTierra = 6371;//en kilómetros
        double dLat = Math.toRadians(lat2 - lat1);
        double dLng = Math.toRadians(lng2 - lng1);
        double sindLat = Math.sin(dLat / 2);
        double sindLng = Math.sin(dLng / 2);
        double va1 = Math.pow(sindLat, 2) + Math.pow(sindLng, 2)* Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2));
        double va2 = 2 * Math.atan2(Math.sqrt(va1), Math.sqrt(1 - va1));
        double distancia = radioTierra * va2;

        return distancia;
    }

}
