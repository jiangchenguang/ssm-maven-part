package com.atguigu.test;

import com.atguigu.ioc_03.HappyComponent;
import com.atguigu.ioc_04.JavaBean2;
import com.atguigu.ioc_05.JavaBean;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringIocTest {

    public void createIoc() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring_03.xml");
    }

    @Test
    public void getBeanFromIoc() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext();
        applicationContext.setConfigLocation("spring_03.xml");
        applicationContext.refresh();

        HappyComponent happyComponent = (HappyComponent)applicationContext.getBean("happyComponent");

        HappyComponent happy = applicationContext.getBean("happyComponent", HappyComponent.class);

        HappyComponent happy2 = applicationContext.getBean(HappyComponent.class);

        happy2.doWork();
        System.out.println(happyComponent == happy);
        System.out.println(happy2 == happy);
    }

    @Test
    public void test04() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring_04.xml");


        JavaBean2 j1 = applicationContext.getBean(com.atguigu.ioc_04.JavaBean2.class);
        JavaBean2 j2 = applicationContext.getBean(com.atguigu.ioc_04.JavaBean2.class);
        System.out.println(j1 == j2);


        applicationContext.close();
    }

    @Test
    public void test05() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring_05.xml");


        JavaBean j1 = applicationContext.getBean(com.atguigu.ioc_05.JavaBean.class);
        System.out.println(j1.toString());

        Object j2 = applicationContext.getBean("&javaBean");
        System.out.println(j2);


        applicationContext.close();
    }
}
