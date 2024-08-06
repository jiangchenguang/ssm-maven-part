import com.atguigu.component.A;
import com.atguigu.component.B;
import com.atguigu.config.JavaConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(value = {JavaConfig.class})
public class Junit5IntergrationTest {

    @Autowired
    private A a;

    @Autowired
    private B b;

    @Test
    public void test() {
        System.out.println(a);
    }
}
