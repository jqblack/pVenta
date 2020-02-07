package manube_v2

import grails.gorm.transactions.Transactional
import grails.transaction.NotTransactional
import grails.util.Holders
import org.springframework.dao.DataAccessException
import org.springframework.jdbc.core.JdbcTemplate

@Transactional
class SqlService {


    static  transactional = true;
    def dataSource= Holders.getGrailsApplication().mainContext.getBean("dataSource")
    def jdbcTemplate

    def  Date GetNow()
    {
        def template= new JdbcTemplate(dataSource);
        return  template.queryForObject("select now()",Date.class);
    }

    Long getSecuenciaComanda()
    {
        def template= new JdbcTemplate(dataSource);
        Long  a=template.queryForObject("SELECT nextval('idcomanda'::regclass)",Long.class);
        return a;
    }

    Map<String,Object> GetQueryMap(String sql)
    {
        try{
            def template= new JdbcTemplate(dataSource);
            return   template.queryForMap(sql);
        }catch(Exception e){
            e.printStackTrace();
            return  [:]
        }
    }



    def List<Map<String, Object>> getQuery(String sql)
    {
        def template = new JdbcTemplate(dataSource)
        return template.queryForList(sql)
    }

    def  Integer GetSecuencia(String tipodocumento,Long empresa)
    {
        def template= new JdbcTemplate(dataSource);
        Integer a=template.queryForObject("select get_secuencia('$tipodocumento',false,$empresa)",Integer.class);
        return a.toInteger();
    }

    def List<Map<String,Object>> GetQuery(String sql)
    {
        def template= new JdbcTemplate(dataSource);
        return   template.queryForList(sql);

    }


    def EjecutarSql(String sql)
    {
        def template= new JdbcTemplate(dataSource);
        template.execute(sql);
    }


    def Object EjecutarSql(String sql,Boolean t)
    {
        def template= new JdbcTemplate(dataSource);
        return   template.queryForObject(sql,Object.class);
    }

    @NotTransactional
    def Ejecutarsql(sql)
    {

        //  groovySql.execute(sql);
        try
        {
            jdbcTemplate.execute(sql);
        }
        catch (DataAccessException e)
        {

            System.err.println(e.getMessage());
            jdbcTemplate.execute("ROLLBACK  WORK;");

        }


    }
    @NotTransactional
    def BeginWork(sql)
    {
        jdbcTemplate.execute(sql);
    }
    @NotTransactional
    def BeginWork()
    {
        jdbcTemplate.execute("BEGIN WORK;");
    }

//    @Transactional
    @NotTransactional
    def CommitWork(sql)
    {
        jdbcTemplate.execute(sql);
    }
    @NotTransactional
    def CommitWork()
    {
        jdbcTemplate.execute("COMMIT WORK ");
    }

    def  String Get_preinter_session_id(String id="")
    {

//        println("entro en el codigo --:>+$id");
        def template= new JdbcTemplate(dataSource);
        String a=template.queryForObject("SELECT get_preinter_session_id('$id')",String.class);
        return a;
    }

    def  BigDecimal get_precio_producto(String id,Long empresa,String inicio,String fin,String dia,String area)
    {

        def template= new JdbcTemplate(dataSource);
        BigDecimal a=template.queryForObject("SELECT get_precios_productos($id,$empresa,$inicio::text,$fin::text,$dia,$area)",BigDecimal.class);
        return a;
    }

    def  String Get_Secuencia_Ncf(Integer numero)
    {
        def template= new JdbcTemplate(dataSource);
        String a=template.queryForObject("select get_secuencia_ncf('$numero')",String.class);
        return a.toString();
    }

    def GetDiaSemana(Long tipo_en_string_o_numero)
    {
        Calendar now = Calendar.getInstance();

        String[] strDays = ["Domingo",
                            "Lunes",
                            "Martes",
                            "Miercoles",
                            "Jueves",
                            "Viernes",
                            "Sabado"];


        if (tipo_en_string_o_numero == 1.toLong())
        {
            return strDays[now.get(Calendar.DAY_OF_WEEK) - 1];

        }else if (tipo_en_string_o_numero ==2.toLong())
        {
            return (now.get(Calendar.DAY_OF_WEEK) - 1).toString()
        }


    }




    def serviceMethod() {

    }
}
