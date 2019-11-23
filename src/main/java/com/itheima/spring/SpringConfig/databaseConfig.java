package com.itheima.spring.SpringConfig;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

@Configuration("databaseConfig")
public class databaseConfig {
    @Bean
    @Scope("prototype")
    public QueryRunner getQueryRunner(DataSource dataSource){
        QueryRunner queryRunner = new QueryRunner(dataSource);
        return  queryRunner;
    }
    @Bean
    public DataSource getDataSource() throws PropertyVetoException {
        ComboPooledDataSource DataSource = new ComboPooledDataSource();
        DataSource.setDriverClass("com.mysql.jdbc.Driver");
        DataSource.setJdbcUrl("jdbc:mysql://localhost:3306/day19");
        DataSource.setUser("root");
        DataSource.setPassword("yue170305");
        return DataSource;
    }

}
