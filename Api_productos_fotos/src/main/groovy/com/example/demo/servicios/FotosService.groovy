package com.example.demo.servicios

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class FotosService {

    @Autowired
    SqlService sqlService;

    List ListaProductos(Long idempresa,Boolean busqueda,String nombre, Long idCategoria){

        String sql = "SELECT\n" +
                "p.f_idrecord,\n" +
                "p.f_referencia,\n" +
                "p.f_descripcion as f_nombre,\n" +
                "f.f_idrecord as foto\n" +
                "FROM\n" +
                "t_productos AS p\n" +
                "LEFT JOIN t_productos_fotos AS f ON p.f_idrecord = f.f_idproducto\n" +
                "WHERE\n" +
                "p.f_idempresa = ${idempresa} \n" +
                "AND f.f_foto is NULL ";


        if (!busqueda){
            sql += " LIMIT 50";
        }
        else{
            if (!nombre.equals("")){
                nombre = nombre+"%";
                sql += " AND (p.f_descripcion ILIKE('${nombre}') OR p.f_referencia ILIKE('${nombre}'))";
            }

            if (idCategoria > 0){
                sql += " AND p.f_idcategoria = ${idCategoria}"
            }
        }

        return sqlService.GetQuery(sql);
    }

    List BuscarCategoria(Long idempresa){

        String sql = "SELECT\n" +
                "pc.f_idrecord,\n" +
                "pc.f_descripcion\n" +
                "FROM\n" +
                "t_productos_categorias AS pc\n" +
                "WHERE\n" +
                "pc.f_idempresa = ${idempresa}";

        return sqlService.GetQuery(sql);
    }

    Map ActualizarFoto(Long idempresa, Long idrecord, byte[] foto, String nombreImg){

        Map mapa = new HashMap();

        try{

            String sql = "INSERT INTO \n" +
                    "  public.t_productos_fotos\n" +
                    "(\n" +
                    "  f_idproducto,\n" +
                    "  f_foto,\n" +
                    "  f_menu,\n" +
                    "  f_nombre,\n" +
                    "  f_idempresa\n" +
                    ")\n" +
                    "VALUES (\n" +
                    "  ?,\n" +
                    "  ?,\n" +
                    "  ?,\n" +
                    "  ?,\n" +
                    "  ?\n" +
                    ")";
            Collection collection = [];

            collection.add(idrecord);
            collection.add(foto);
            collection.add(true);
            collection.add(nombreImg);
            collection.add(idempresa);

            sqlService.EjecutarQuery(sql,collection)

            mapa.put("f_bandera",true);
            mapa.put("f_mensaje","Realizado con exito!");

            return mapa;
        }catch(Exception e){
            e.printStackTrace();
            mapa.put("f_bandera",false);
            mapa.put("f_mensaje","Ha ocurrido algun error al subir su foto");
        }

    }

}
