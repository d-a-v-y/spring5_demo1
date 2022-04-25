import com.atguigu.spring.bean.Orders;
import com.atguigu.spring.collection.Book;
import com.atguigu.spring.collection.Course;
import com.atguigu.spring.collection.Stu;
import com.atguigu.spring.factorybean.MyBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Davy
 */
public class TestSpring5Demo {
    @Test
    public void testCollection1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean1.xml");
        Stu stu = applicationContext.getBean("stu", Stu.class);
        stu.test();
    }

    @Test
    public void testCollection2(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean2.xml");
        Book book1 = applicationContext.getBean("book", Book.class);
        Book book2 = applicationContext.getBean("book", Book.class);
        System.out.println(book1);
        System.out.println(book2);
    }

    @Test
    public void testCollection3(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean3.xml");
        Course course = applicationContext.getBean("mybean", Course.class);
        System.out.println(course);
    }

    @Test
    public void testBean(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");
        Orders orders = context.getBean("orders", Orders.class);
        System.out.println("第六步 获取创建bean实例对象");
        System.out.println(orders);
        context.close();
    }
}
