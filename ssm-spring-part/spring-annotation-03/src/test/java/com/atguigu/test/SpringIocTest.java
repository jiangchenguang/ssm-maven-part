package com.atguigu.test;

import com.atguigu.ioc_01.XxxController;
import com.atguigu.ioc_01.XxxDao;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringIocTest {

    @Test
    public void testIoc_01() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-01.xml");

        XxxDao dao = context.getBean(XxxDao.class);
        System.out.println(dao);

        Object service = context.getBean("ser");
        System.out.println(service);
    }
}
