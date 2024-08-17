package com.atguigu.pointcut;

import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
public class MyPointCut {

    @Pointcut("execution(* com.atguigu.service.impl.*.*(..))")
    public void pc() {
    }
}
