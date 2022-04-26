package aopAnno;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author Davy
 */

@Component
@Aspect
@Order(1)
public class PersonProxy {

    @After(value = "execution(* aopAnno.User.add(..))")
    public void after(){
        System.out.println("PersonProxy 类的 after 方法被调用......");
    }
}
