package aopAnno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author Davy
 */

@Component
@Aspect
@Order(0)
public class UserProxy {

    @Pointcut(value = "execution(* aopAnno.User.add(..))")
    public void pointDemo(){
    }

    @Before(value = "pointDemo()")
    public void before(){
        System.out.println("UserProxy 类的 before 方法被调用......");
    }

    @After(value = "execution(* aopAnno.User.add(..))")
    public void after(){
        System.out.println("UserProxy 类的 after 方法被调用......");
    }

    @AfterReturning(value = "execution(* aopAnno.User.add(..))")
    public void afterReturning(){
        System.out.println("UserProxy 类的 AfterReturning 方法被调用......");
    }

    @AfterThrowing(value = "execution(* aopAnno.User.add(..))")
    public void afterThrowing(){
        System.out.println("UserProxy 类的 afterThrowing 方法被调用......");
    }

    @Around(value = "execution(* aopAnno.User.add(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        System.out.println("环绕之前......");

        proceedingJoinPoint.proceed();

        System.out.println("环绕之后......");
    }
}
