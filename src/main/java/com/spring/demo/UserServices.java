package com.spring.demo;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class UserServices {
   public void method1() {
        System.out.println("This is method number 1");
    }

    public void method2() throws IOException {
       throw new IOException("This is My Exception");
    }
    @Deprecated
    void method3() {
        System.out.println("This is Depreciated Method");
    }

}
