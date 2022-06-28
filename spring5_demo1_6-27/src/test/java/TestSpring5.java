import com.atguigu.spring5.Book;
import com.atguigu.spring5.Order;
import com.atguigu.spring5.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Davy
 */
public class TestSpring5 {

    @Test
    public void testAdd(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        Book book = context.getBean("book", Book.class);

        System.out.println(book);
        book.testDemo();
    }

    @Test
    public void testOrder(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        Order order = context.getBean("order", Order.class);

        System.out.println(order);
        order.ordersTest();
    }
}
