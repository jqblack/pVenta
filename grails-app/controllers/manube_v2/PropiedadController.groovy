package manube_v2

import grails.converters.JSON

class PropiedadController {


    FuncionesSQLService funcionesSQLService
    ValidacionesService validacionesService

    def index() { }

    def propiedad_producto()
    {

    }

    def get_propiedades()
    {
        Map<String, Object> data = new HashMap<String, Object>()
        def propiedades = Tpropiedades.findAllByFIdempresaAndFIdcategoria(session.user.fIdempresa as Long, params.id as Long)
        data.put("propiedades", propiedades)
        render data as JSON
    }

    def get_producto_propiedades()
    {
        Map<String, Object> data = new HashMap<String, Object>()
        def propiedades = funcionesSQLService.getPropiedadesEnProducto(params.idproducto as Long, params.categoria as Long, session.user.fIdempresa as Long)
        data.put("propiedades", propiedades)
        render data as JSON
    }



    def store(){

        Map<String, Object> response_data = new HashMap<String, Object>()
        Map<String, Object> errors = new HashMap<String, Object>()

        def data = JSON.parse(params.data)

        //println(data.descripcion)

        if (data)
        {
            def errorValidacion
            errorValidacion = validacionesService.validarPropiedad(data)

            if (errors.size() > 0)
            {
                render response_data.put("errors", errorValidacion)
                return
            }

            def propiedad = funcionesSQLService.guardarPropiedad(data, session.user.fIdempresa)


            if(propiedad) {
                response_data.put("success", true)
                render response_data as JSON
            }
            else{
                response_data.put("success", true)
                render response_data as JSON
            }


        }
        else{
            response_data.put("success", false)
            render response_data as JSON
        }
    }

    def add_propiedades_producto() {
        Map<String, Object> response_data = new HashMap<String, Object>()
        Map<String, Object> errors = new HashMap<String, Object>()
        List<Object> errorValidacion = new ArrayList<Object>()

        def data = JSON.parse(params.data)

        println(data.propiedades)

        if (data)
        {

            //errorValidacion = validacionesService.validarPropiedad(data)

            if (data.propiedades.isEmpty())
            {

                errorValidacion.add("No se ha agregado ninguna propiedad")
                response_data.put("errors", errorValidacion)
                render response_data as JSON
                return
            }

            def propiedad = funcionesSQLService.addPropiedadesProducto(data, session.user.fIdempresa)


            if(propiedad) {
                response_data.put("success", true)
                render response_data as JSON
            }
            else{
                response_data.put("success", false)
                render response_data as JSON
            }


        }
        else{
            response_data.put("success", false)
            render response_data as JSON
        }
    }

}
