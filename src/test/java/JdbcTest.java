import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcTest {
    @Test
    public void test(){
        ApplicationContext ioc=new  ClassPathXmlApplicationContext("application_config.xml");
        JdbcTemplate jdbcTemplate=(JdbcTemplate)ioc.getBean("template");
        String sql="select * from user_id ";
        jdbcTemplate.queryForList(sql);
    }
}
