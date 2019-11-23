package com.itheima.spring.SpringConfig;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

@Configuration("config")
@ComponentScan("com.itheima")
@Import(databaseConfig.class)
public class config {

}

