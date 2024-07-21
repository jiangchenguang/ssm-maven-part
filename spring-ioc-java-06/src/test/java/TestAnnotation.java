import com.atguigu.config.JavaConfiguration;
import com.atguigu.ioc_01.StudentController;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestAnnotation {
    @Test
    public void test() {
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfiguration.class);

        StudentController controller = context.getBean(StudentController.class);
        controller.queryAll();
    }
}
