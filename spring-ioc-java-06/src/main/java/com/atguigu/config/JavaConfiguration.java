package com.atguigu.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@ComponentScan("com.atguigu.ioc_01")
@PropertySource("classpath:jdbc.properties")
@Configuration
public class JavaConfiguration {

    @Value("${jdbc.url}")
    public String url;

    @Value("${jdbc.driverClassName}")
    public String driverClassName;

    @Value("${jdbc.username}")
    public String username;

    @Value("${jdbc.password}")
    public String password;

    @Bean
    public DruidDataSource dataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl(url);
        dataSource.setDriverClassName(this.driverClassName);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        return dataSource;
    }
}
