package com.example.demo.componentes

import com.example.demo.Funciones.Funciones
import com.example.demo.servicios.FotosService
import groovy.json.JsonSlurper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.transaction.annotation.Transactional
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.multipart.MultipartHttpServletRequest

import javax.servlet.http.HttpServletRequest

@RequestMapping(value = "/fotos")
@RestController
class fotos {

    @Autowired
    FotosService fotosService;

    Funciones funciones = new Funciones();

    @RequestMapping(value="/lista", method = RequestMethod.POST)
    def BuscarLista(@RequestParam(name = "dato")String dato){

        JsonSlurper jsonSlurper = new JsonSlurper();
        Map json = jsonSlurper.parseText(new String(dato.decodeBase64())) as Map
        Map data = json.f_data;

        Boolean validacion = funciones.CheckToken(json);

        if (!validacion){
            return funciones.convertir("-1","ERROR");
        }
        else{
            println("ENTRO");
            List list = fotosService.ListaProductos(data.get("f_idempresa").toString().toLong(),
            data.get("f_buscando").toString().toBoolean(),
            data.get("f_nombre").toString(),
            data.get("f_categoria").toString().toLong());

            return funciones.convertir("1",list)
        }
    }

    @RequestMapping(value="/categoria", method = RequestMethod.POST)
    def BuscarCategoria(@RequestParam(name = "dato")String dato){

        JsonSlurper jsonSlurper = new JsonSlurper();
        Map json = jsonSlurper.parseText(new String(dato.decodeBase64())) as Map
        Map data = json.f_data;

        Boolean validacion = funciones.CheckToken(json);

        if (!validacion){
            return funciones.convertir("-1","ERROR");
        }
        else{
            List list = fotosService.BuscarCategoria(data.get("f_idempresa").toString().toLong());
            return funciones.convertir("1",list)
        }
    }

//    @RequestMapping(value="/actualizar", method = RequestMethod.POST)
////    def ActualizarFoto(@RequestParam(name = "dato")String dato,@RequestParam(name = "test")String test){
//    def ActualizarFoto(@RequestParam Map<String,Object> allRequestParams){
//
//        JsonSlurper jsonSlurper = new JsonSlurper();
//        Map json = jsonSlurper.parseText(new String(allRequestParams.dato.toString().decodeBase64())) as Map
//        Map data = json.f_data;
//
//        Boolean validacion = funciones.CheckToken(json);
//
//        if (!validacion){
//            return funciones.convertir("-1","ERROR");
//        }
//        else{
//            Map mapa = fotosService.ActualizarFoto(data.get("f_idempresa").toString().toLong(),
//            data.get("f_idproducto").toString().toLong(),
//            data.get("f_foto").toString());
//            return funciones.convertir("1",mapa)
//        }
//    }

    @RequestMapping(value="/actualizar", method = RequestMethod.POST)
    def ActualizarFoto(HttpServletRequest servletRequest, MultipartHttpServletRequest request){
        JsonSlurper jsonSlurper = new JsonSlurper();
        Map json = jsonSlurper.parseText(new String(servletRequest.getParameter("dato").decodeBase64())) as Map
        Map data = json.f_data;
        Boolean validacion = funciones.CheckToken(json);

        if (!validacion){
            return funciones.convertir("-1","ERROR");
        }
        else{

            println(request.getFile("f_foto").getSize());

//            new File("C:\\Users\\JQ\\Desktop\\randi\\img.jpg").setBytes(request.getFile("f_foto").getBytes());

            Map mapa = fotosService.ActualizarFoto(data.get("f_idempresa").toString().toLong(),
                    data.get("f_idproducto").toString().toLong(),
                    request.getFile("f_foto").getBytes(),
                    request.getFile("f_foto").getOriginalFilename()
            );
            return funciones.convertir("1",mapa)
//            return funciones.convertir("1",[id:1,hola:2])

        }
    }



    @RequestMapping(value="/fototest", method = RequestMethod.POST)
    def fotoTest(@RequestParam(name = "dato")String dato){

        println("Var dato: "+dato);
        JsonSlurper jsonSlurper = new JsonSlurper();
        Map json = jsonSlurper.parseText(new String(dato.decodeBase64())) as Map
        Map data = json.f_data;

        println(data.get("f_foto").toString().decodeBase64())
//        Boolean validacion = funciones.CheckToken(json);
//
//        if (!validacion){
//            return funciones.convertir("-1","ERROR");
//        }
//        else{
//            Map mapa = fotosService.ActualizarFoto(data.get("f_idempresa").toString().toLong(),
//                    data.get("f_idproducto").toString().toLong(),
//                    data.get("f_foto").toString());
//            return funciones.convertir("1",mapa)
//        }

        return "yes";
    }
}
