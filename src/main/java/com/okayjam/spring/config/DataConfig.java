package com.okayjam.spring.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.JdbcTemplate;


import javax.sql.DataSource;
import java.util.ResourceBundle;

@Configuration
public class DataConfig {

  // JDBC driver name and database URL
  static final String JDBC_DRIVER =  ResourceBundle.getBundle("jdbc").getString("driverClassName");
  static final String DB_URL = ResourceBundle.getBundle("jdbc").getString("url");
  //  Database credentials
  static final String USER = ResourceBundle.getBundle("jdbc").getString("user" );
  static final String PASS = ResourceBundle.getBundle("jdbc").getString("password");
  static final int MAX_ACTIVE = Integer.valueOf(ResourceBundle.getBundle("jdbc").getString("maxActive"));

  @Bean
  public DataSource dataSource() {
    DruidDataSource ds = new DruidDataSource();
    ds.setDriverClassName(JDBC_DRIVER);
    ds.setUrl(DB_URL);
    ds.setUsername(USER);
    ds.setPassword(PASS);
    ds.setMaxActive(MAX_ACTIVE);
    return ds;
  }
  
  @Bean
  public JdbcOperations jdbcTemplate(DataSource dataSource) {
    return new JdbcTemplate(dataSource);
  }

}
