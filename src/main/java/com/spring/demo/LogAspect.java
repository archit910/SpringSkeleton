package com.spring.demo;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {

        @Pointcut("execution(* com.spring.demo.UserServices.*(..))")
        private void logAfter(){}


        @Before("logAfter()")
        public void check(){
            System.out.println("THIS IS LOGGED BEFORE");
        }

}
