package atguigu.pointcut;

import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

public class MyPointCut {

    @Pointcut("execution(* com.atguigu.service.impl.*.*(..))")
    public void pc() {
    }
}
