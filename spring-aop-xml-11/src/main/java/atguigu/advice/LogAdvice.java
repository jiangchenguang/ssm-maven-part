package atguigu.advice;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
public class LogAdvice {


    public void start(){
        System.out.println("方法开始了");
    }

    public void after(){
        System.out.println("方法结束了");
    }

    public void error(){
        System.out.println("方法报错了");
    }
}
