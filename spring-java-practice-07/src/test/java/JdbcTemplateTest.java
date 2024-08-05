import atguigu.Config.JavaConfig;
import atguigu.controller.StudentController;
import atguigu.pojo.Student;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class JdbcTemplateTest {


    @Test
    public void testQueryAll() {
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        StudentController controller = context.getBean(StudentController.class);
        List<Student> students = controller.getStudentList();
        System.out.println(students);
    }
}
