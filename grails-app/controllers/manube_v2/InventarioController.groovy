package manube_v2

import grails.converters.JSON

class InventarioController {
    static allowedMethods = [
            get_suplidores: "POST"
    ]

    FuncionesSQLService funcionesSQLService
    ValidacionesService validacionesService
    SqlService sqlService

//    def index() { }

    def entrada () {

    }

    def salida () {

    }

    def store_salida()
    {
        def data = JSON.parse(params.data)

        Map<String, Object> response_data = new HashMap<String, Object>()
        Map<String, Object> errors = new HashMap<String, Object>()

        List<Object> errorsSalida
        errorsSalida = validacionesService.validarSalidaInventario(data)

        if (errorsSalida.size() > 0)
        {
            errors.put("errorsSalida", errorsSalida)
            render errors as JSON
        }

        if (data.detalle.isEmpty())
        {
            errorsSalida = new ArrayList<Object>()
            errorsSalida.add("No se ha seleccionada ningun producto.")
            errors.put("errorsEntrada", errorsSalida)
            render errors as JSON
        }

        if(funcionesSQLService.guardarSalida(data, session.user.fIdempresa, session.user.id) )
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

    def store_entrada()
    {
        def data = JSON.parse(params.data)

        Map<String, Object> response_data = new HashMap<String, Object>()
        Map<String, Object> errors = new HashMap<String, Object>()

        List<Object> errorsEntrada
        errorsEntrada = validacionesService.validarEntradaInventario(data)

        if (errorsEntrada.size() > 0)
        {
            errors.put("errorsEntrada", errorsEntrada)
            render errors as JSON
        }

        if (data.detalle.isEmpty())
        {
            errorsEntrada = new ArrayList<Object>()
            errorsEntrada.add("No se ha seleccionada ningun producto.")
            errors.put("errorsEntrada", errorsEntrada)
            render errors as JSON
        }

        if(funcionesSQLService.guardarEntrada(data, session.user.fIdempresa, session.user.id) )
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

    def get_suplidores()
    {
        def suplidores = Tsuplidores.findAllByFNombreIlike("%" + params.filtro + "%")
        render suplidores as JSON
    }

    def get_conceptos()
    {
        def conceptos = TconceptosInventario.findAllByFDescripcionIlikeAndFIdempresa("%" + params.filtro + "%", session.user.fIdempresa)
        render conceptos as JSON
    }
}
