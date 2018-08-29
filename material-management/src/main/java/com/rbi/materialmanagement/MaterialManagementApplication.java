package com.rbi.materialmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@EnableTransactionManagement
@SpringBootApplication
//项目的启动类
public class MaterialManagementApplication {

//   spring boot框架会自动注入 dataSource
    @Bean(name="transactionManager")
    public PlatformTransactionManager txManager(DataSource dataSource){
        return  new DataSourceTransactionManager(dataSource);
    }

    public static void main(String[] args) {
        SpringApplication.run(MaterialManagementApplication.class, args);
    }
}
