package atguigu.advice;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

public class MyAdvice {

    @Before("execution(* com..impl.*.*(..))")
    public void before(JoinPoint joinPoint) {
        String simpleName = joinPoint.getTarget().getClass().getSimpleName();
        String name = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
    }

    @AfterReturning(value = "execution(* com..impl.*.*(..))", returning = "result")
    public void afterReturning(JoinPoint joinPoint, Object result) {

    }

    @After("execution(* com..impl.*.*(..))")
    public void after(JoinPoint joinPoint) {
    }

    @AfterThrowing(value = "execution(* com..impl.*.*(..))", throwing = "throwable")
    public void afterThrowing(JoinPoint joinPoint, Throwable throwable) {}
}
