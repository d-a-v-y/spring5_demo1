import com.atguigu.spring.service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * @author Davy
 */

@RunWith(SpringJUnit4ClassRunner.class)//单元测试框架
@ContextConfiguration("classpath:bean1.xml")//加载配置文件
public class Junit4Test {

    @Autowired
    private UserService userService;

    @Test
    public void test1(){
        userService.accountMoney();
    }

}
