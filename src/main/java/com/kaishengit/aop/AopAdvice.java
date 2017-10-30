package com.kaishengit.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Created by hoyt on 2017/10/30.
 */

@Component
@Aspect
public class AopAdvice {

    @Pointcut("execution(* com.kaishengit.service..*.*(..))")
    public void pointcut() {}

    @Before("pointcut()")
    public void before() {
        System.out.println("前置通知");
    }

    @AfterReturning(pointcut = "pointcut()",returning = "result")
    public void afterReturning (Object result) {
        System.out.println("后置通知");
    }

    @AfterThrowing(pointcut = "pointcut()",throwing = "ex")
    public void afterThrowing(Exception ex) {
        System.out.println("异常通知:" + ex.getMessage());
    }

    @After("pointcut()")
    public void after() {
        System.out.println("最终通知");
    }

   /* @Around("pointcut()")
    public void around(ProceedingJoinPoint joinPoint) {
        try {
            Object result = joinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }*/

}
