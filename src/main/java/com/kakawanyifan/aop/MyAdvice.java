package com.kakawanyifan.aop;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class MyAdvice {

    @Pointcut("execution(* com.kakawanyifan.dao.BookDao.select())")
    private void pt(){}

    @Around("pt()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        for (int i = 0 ; i<3 ; i++) {
            //调用原始操作
            pjp.proceed();
        }
        return null;
    }

}
