package test;

import atguigu.config.JavaConfig;
import atguigu.service.Calculator;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAopTest {

    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("aop.xml");

        Calculator calculator = context.getBean(Calculator.class);
        int value = calculator.div(1, 1);
        System.out.println(value);
        System.out.println(calculator);
    }
}
