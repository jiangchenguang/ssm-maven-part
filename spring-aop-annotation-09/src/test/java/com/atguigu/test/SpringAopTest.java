package com.atguigu.test;

import com.atguigu.config.JavaConfig;
import com.atguigu.service.Calculator;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAopTest {

    @Test
    public void test() {
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

        Calculator calculator = context.getBean(Calculator.class);
        int value = calculator.div(1, 0);
        System.out.println(value);
        System.out.println(calculator);
    }
}
