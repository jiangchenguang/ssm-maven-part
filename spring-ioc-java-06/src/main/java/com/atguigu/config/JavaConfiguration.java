package com.atguigu.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;

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

    @Bean(name = "ergouzi")
    public DruidDataSource dataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl(url);
        dataSource.setDriverClassName(this.driverClassName);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        return dataSource;
    }

    @Bean(name = "lvdandan")
    public DruidDataSource dataSource1() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl(url);
        dataSource.setDriverClassName(this.driverClassName);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        return dataSource;
    }

    @Bean
    public JdbcTemplate jdbcTemplate(DruidDataSource ergouzi) {
        JdbcTemplate template = new JdbcTemplate();
        // 如果没有对应类型的ioc组件，则报错
        // 如果有多个对应类型的ioc组件，必须通过形参名指定对应的beanid
        template.setDataSource(ergouzi);
        return template;
    }
}
