package manube_v2

import grails.converters.JSON

class ClienteController {

    static allowedMethods = [
            store: 'POST',
            get_data_combos: 'POST',
            get_cliente: 'POST',
            get_lista_clientes: 'POST'
    ]

    FuncionesSQLService funcionesSQLService
    ValidacionesService validacionesService

    def index() { }

    def get_data_combos()
    {
        Map<String, Object> data = new HashMap<String, Object>()
        def companias = Tclientes.findAllByFIdempresaAndFEmpresa(session.user.fIdempresa as Long, true)
        data.put("companias", companias)

        def tipoContactos = TtiposContactos.findAllByFIdempresa(session.user.fIdempresa as Long)
        data.put("tipoContactos", tipoContactos)


        render data as JSON
    }

    def get_lista_clientes()
    {
        Map<String, Object> data = new HashMap<String, Object>()
        def clientes = Tclientes.findAllByFIdempresaAndFNombreIlike(session.user.fIdempresa as Long,"%" + params.filtro.toString() + "%")
        data.put("clientes", clientes)


        render data as JSON
    }


    def get_cliente()
    {
        Map<String, Object> data = new HashMap<String, Object>()
        def cliente = Tclientes.findById(params.id.toLong())
        def sql_contacto = " from TclientesContactos as c inner join TtiposContactos as t on c.fIdtipo = t.id where c.fIdcliente = :id"

        def contactos

        contactos = TclientesContactos.findAll(sql_contacto, [id: params.id.toLong()])
        println(cliente)


        data.put("cliente", cliente)
        data.put("contactos", contactos)


        render data as JSON
    }

    def store()
    {
        def data = JSON.parse(params.data)

        Map<String, Object> response_data = new HashMap<String, Object>()
        Map<String, Object> errors = new HashMap<String, Object>()

        List<Object> errorsCliente
        errorsCliente = validacionesService.validarCliente(data)

        if (errorsCliente.size() > 0)
        {
            errors.put("errorsCliente", errorsCliente)
            render errors as JSON
            return
        }

        if(funcionesSQLService.guardarCliente(data, session.user.fIdempresa) )
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

//    def get_tipo_contacto()
//    {
//        Map<String, Object> data = new HashMap<String, Object>()
//        def tipoContactos = TtiposContactos.findAllByFIdempresa(session.user.fIdempresa as Long)
//        data.put("tipoContactos", tipoContactos)
//        render data as JSON
//    }
}
