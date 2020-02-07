import org.springframework.jdbc.core.JdbcTemplate

// Place your Spring DSL code here
beans = {
    groovySql(groovy.sql.Sql, ref('dataSource'))
    jdbcTemplate(JdbcTemplate) {
        dataSource = ref('dataSource')
    }
    
    
}
