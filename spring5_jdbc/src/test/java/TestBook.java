import com.atguigu.spring.entity.Book;
import com.atguigu.spring.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Davy
 */
public class TestBook {

    @Test
    public void testJdbcTemplate(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        Book book = new Book();
//        book.setUserId("1");
//        book.setUsername("java");
//        book.setUstatus("一二三");
//        bookService.addBook(book);


//        book.setUserId("1");
//        book.setUsername("golang");
//        book.setUstatus("三二一");
//        bookService.deleteBook("1");

//        int count = bookService.findCount();
//        System.out.println(count);
//
//        System.out.println(bookService.findOne("1"));
//
//        System.out.println(bookService.findAll());

        //批量添加
//        List<Object[]> batchArgs = new ArrayList<>();
//        Object[] o1 ={"3","c++","c"};
//        Object[] o2 = {"4","julia","d"};
//        Object[] o3 = {"5","c","e"};
//        batchArgs.add(o1);
//        batchArgs.add(o2);
//        batchArgs.add(o3);
//        bookService.batchAdd(batchArgs);

        //批量修改
//        List<Object[]> batchArgs = new ArrayList<>();
//        Object[] o1 ={"mybatis","x","3"};
//        Object[] o2 = {".net","y","4"};
//        Object[] o3 = {"redis","z","5"};
//        batchArgs.add(o1);
//        batchArgs.add(o2);
//        batchArgs.add(o3);
//        bookService.batchUpdate(batchArgs);

        //批量删除
        List<Object[]> batchArgs = new ArrayList<>();
        Object[] o2 = {"4"};
        Object[] o3 = {"5"};
        batchArgs.add(o2);
        batchArgs.add(o3);
        bookService.batchDelete(batchArgs);
    }
}
