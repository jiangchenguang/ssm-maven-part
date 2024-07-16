package com.atguigu.ioc_05;

import org.springframework.beans.factory.FactoryBean;

public class JavaBeanFactoryBean implements FactoryBean<JavaBean> {

    public void setValue(String value) {
        this.value = value;
    }

    private String value;

    @Override
    public JavaBean getObject() throws Exception {
        JavaBean bean = new JavaBean();
        bean.setName(this.value);
        return bean;
    }

    @Override
    public Class<?> getObjectType() {
        return JavaBean.class;
    }
}
