import org.junit.Test;

import java.util.Comparator;
import java.util.function.Consumer;

/**
 * @author Davy
 */
public class LambdaTest {

    @Test
    public void test1() {
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("翟");
            }
        };
        r1.run();

        System.out.println("=======================");

        Runnable r2 = () -> System.out.println("飞");
        r2.run();
    }

    @Test
    public void test2(){

        Comparator<Integer> compare1 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1,o2);
            }
        };
        int c1 = compare1.compare(1, 0);
        System.out.println(c1);

        System.out.println("=======================");

        Comparator<Integer> compare2 = (o1,o2) -> Integer.compare(o1,o2);
        int c2 = compare2.compare(0, 0);
        System.out.println(c2);

        System.out.println("=======================");

        Comparator<Integer> compare3 = Integer :: compare;
        int c3 = compare3.compare(0, 1);
        System.out.println(c3);
    }

    @Test
    public void test3(){
        Consumer<String> con = (s) -> System.out.println(s);
        con.accept("see you");

        System.out.println("=======================");

        Consumer<String> con2 = s -> System.out.println(s);
        con.accept("see you");
    }

    @Test
    public void test4(){
        Comparator<Integer> c = (o1, o2) -> {
            System.out.println("myself");
            return o1.compareTo(o2);
        };
        System.out.println(c.compare(1,0));
    }

    @Test
    public void test5(){
        Comparator<Integer> c = (o1, o2) -> o1.compareTo(o2);
        System.out.println(c.compare(0,1));
    }
}
