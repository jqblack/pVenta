package manube_v2

import grails.converters.JSON

class CategoriaController {

    //static allowedMethods = [store: 'POST', get_categorias: 'POST']


    FuncionesSQLService funcionesSQLService
    ValidacionesService validacionesService

    def index() { }

    def get_categorias()
    {
        Map<String, Object> data = new HashMap<String, Object>()
        def categorias = TproductosCategorias.findAllByFIdempresa(session.user.fIdempresa as Long)
        data.put("categorias", categorias)
        render data as JSON
    }

    def store(){

        Map<String, Object> response_data = new HashMap<String, Object>()
        Map<String, Object> errors = new HashMap<String, Object>()

        def data = JSON.parse(params.data)

        //println(data.descripcion)

        if (data)
        {
            List errorValidacione
            errorValidacione = validacionesService.validarCategoria(data)

            if (errorValidacione.size() > 0)
            {
                response_data.put("errors", errorValidacione)
                render response_data as JSON
            }


             if(data.id.toString().toLong() > 0) {
                 def categoria =  TproductosCategorias.get(data.id as Long)
                 categoria.fDescripcion = data.descripcion.toString().toUpperCase()
                 categoria.fIdempresa = session.user.fIdempresa
                 if (categoria.save(flush: true))
                 {

                     response_data.put("success", true)
                     render response_data as JSON
                 }

             }
             else{
                 def categoria = new TproductosCategorias()
                 categoria.fDescripcion = data.descripcion.toString().toUpperCase()
                 categoria.fIdempresa = session.user.fIdempresa
                 if (categoria.save(failOnError: true))
                 {

                     response_data.put("success", true)
                     render response_data as JSON
                 }
             }


        }
        else{
            response_data.put("success", false)
            render response_data as JSON
        }
    }

}
