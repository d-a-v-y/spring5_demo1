import com.atguigu.spring.bean.Emp;
import com.atguigu.spring.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Davy
 */
public class TestBean {
    @Test
    public void testBean1(){
        //加载Spring配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean2.xml");

        //获取配置创建的对象
        UserService userService = applicationContext.getBean("userService", UserService.class);

        userService.add();
    }

    @Test
    public void testBean2(){
        //加载Spring配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean4.xml");

        //获取配置创建的对象
        Emp emp = applicationContext.getBean("emp", Emp.class);

        emp.add();
    }
}
