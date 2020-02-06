package com.demo.domain.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;
import java.util.Properties;

@Configuration
@PropertySource("classpath:/application.yml")
public class DatabaseConfiguration {

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.hikari")
    public HikariConfig hikariConfig(){
        return new HikariConfig();
    }

    @Bean DataSource datasource() throws Exception{
        DataSource dataSource = new HikariDataSource(hikariConfig());
        System.out.println(dataSource.toString());
        return dataSource;
    }

//    @Bean
//    @ConfigurationProperties(prefix = "spring.datasource")
//    DataSource datasource() throws Exception{
//        return DataSourceBuilder.create()
//                .type(HikariDataSource.class)
//                .build();
//    }

    @Bean
    @ConfigurationProperties(prefix = "spring.jpa")
    public Properties hibernateConfig(){
        return new Properties();
    }
}
