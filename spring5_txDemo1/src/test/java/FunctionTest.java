import com.atguigu.spring.service.UserService;
import org.junit.Test;
import org.springframework.context.support.GenericApplicationContext;

import java.util.function.Supplier;

/**
 * @author Davy
 */
public class FunctionTest {

    //函数式风格创建对象，交给Spring进行管理
    @Test
    public void testGenericApplicationContext(){
        //创建GenericApplicationContext
        GenericApplicationContext context = new GenericApplicationContext();
        //调用context的方法对象注册
        context.refresh();
        context.registerBean("userService", UserService.class, () -> new UserService());
        //获取到在Spring注册的对象
        UserService userService =(UserService) context.getBean("userService");
        System.out.println(userService);
    }
}
