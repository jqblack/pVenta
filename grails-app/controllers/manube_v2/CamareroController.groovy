package manube_v2

import grails.converters.JSON

class CamareroController {

    FuncionesSQLService funcionesSQLService
    ValidacionesService validacionesService

    def index() { }

    def get_lista_camareros()
    {
        Map<String, Object> data = new HashMap<String, Object>()
        List<Object> list = new ArrayList<Object>()

        def sql = "from Tcamareros as c inner join Tareas as a on a.id = c.fIdArea where c.fActivo = true and c.fIdempresa = :idempresa and lower(c.fNombre) like :nom order by c.fNombre ASC"
        def camareros = Tcamareros.findAll(sql, [idempresa: session.user.fIdempresa, nom: "%" + params.filtro.toString() + "%"])

        camareros.each { row ->
            Map<String, Object> camarero = new HashMap<String, Object>()

            camarero.put("id", row[0].id)
            camarero.put("fNombre", row[0].fNombre)
            camarero.put("fIdArea", row[0].fIdArea)
            camarero.put("fApellido", row[0].fApellido)
            camarero.put("fCedula", row[0].fCedula)
            camarero.put("fDireccion", row[0].fDireccion)
            camarero.put("fSueldo", row[0].fSueldo)
            camarero.put("fIdempresa", row[0].fIdempresa)
            camarero.put("fCamareroActivo", row[0].fCamareroActivo)
            camarero.put("fNombreArea", row[1].fNombreArea)
            list.add(camarero)
        }


        data.put("camareros", list)
        render data as JSON
    }


    def get_camarero()
    {
        Map<String, Object> data = new HashMap<String, Object>()

        def camarero = Tcamareros.findByIdAndFIdempresa(params.id as Long,session.user.fIdempresa as Long)
        data.put("camarero", camarero)
        render data as JSON
    }

    def store()
    {
        def data = JSON.parse(params.data)

        Map<String, Object> response_data = new HashMap<String, Object>()
        Map<String, Object> errors = new HashMap<String, Object>()

        List<Object> errorsCamarero
        errorsCamarero = validacionesService.validarCamarero(data,session.user.fIdempresa as Long)

        if (errorsCamarero.size() > 0)
        {
            errors.put("errorsCamarero", errorsCamarero)
            render errors as JSON
            return
        }

        if(funcionesSQLService.guardarCamarero(data, session.user.fIdempresa) )
        {
            response_data.put("success", true)
            render response_data as JSON
        }
        else
        {
            response_data.put("success", false)
            render response_data as JSON
        }

    }
}
