import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Davy
 */
public class UserLog {
    private static final Logger log = LoggerFactory.getLogger(UserLog.class);

    @Test
    public void test() {
        log.info("hello log4j2");
        log.warn("hello log4j2");
    }
}
