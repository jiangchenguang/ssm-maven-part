package com.atguigu.test;

import com.atguigu.ioc_01.XxxController;
import com.atguigu.ioc_01.XxxDao;
import com.atguigu.ioc_02.JavaBean;
import com.atguigu.ioc_03.UserService;
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

    @Test
    public void testIoc_02() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-02.xml");
        JavaBean bean1 = (JavaBean) context.getBean(JavaBean.class);
        JavaBean bean2 = (JavaBean) context.getBean(JavaBean.class);
        System.out.println(bean1 == bean2);
    }

    @Test
    public void testIoc_03() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-03.xml");
        UserService service = context.getBean(UserService.class);
        service.show();
    }
}
