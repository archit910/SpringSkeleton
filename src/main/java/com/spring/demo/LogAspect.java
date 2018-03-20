package com.spring.demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Aspect
@Component
public class LogAspect {

        @Pointcut("execution(* com.spring.demo.UserServices.*(..))")
        private void selectAll(){}


        @Before("selectAll()")
        public void check() {
            System.out.println("THIS IS LOGGED BEFORE");
        }


        @AfterThrowing(pointcut = "selectAll()", throwing = "ex")
        void check1(IOException ex) {
            System.out.println(ex.getMessage());
        }

        @Before("execution(* com.spring.demo.UserServices.*(..)) && @annotation(java.lang.Deprecated)")
        void check2() {
            System.out.println("Depreciated Method has been Called");
        }

        @Before("execution(* com.spring.demo.UserServices.*(..))")
        public void logBefore(JoinPoint joinPoint){
        System.out.println(joinPoint.getSignature());
        System.out.println(joinPoint.getArgs());

    }
}
