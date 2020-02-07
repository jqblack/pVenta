package manube_v2

import grails.gorm.transactions.Transactional
import groovy.transform.CompileStatic


class ProductosService {

    @CompileStatic
    List<Tproductos> listarProductos_filtro(String parametro, Long idEmpresa)
    {
        String sql="from Tproductos as b where b.fIdempresa=? and lower(b.fDescripcion) like ?";
        Collection collection=[];
        collection.add(idEmpresa);
        collection.add(parametro.toLowerCase()+'%')
        return  Tproductos.findAll(sql,collection).toList()
    }

    def serviceMethod() {

    }
}
