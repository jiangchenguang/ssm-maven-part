package com.atguigu.advice;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAdvice {


    @Before("com.atguigu.pointcut.MyPointCut.pc()")
    public void start(){
        System.out.println("方法开始了");
    }

    @After("com.atguigu.pointcut.MyPointCut.pc()")
    public void after(){
        System.out.println("方法结束了");
    }

    @AfterThrowing("com.atguigu.pointcut.MyPointCut.pc()")
    public void error(){
        System.out.println("方法报错了");
    }
}
