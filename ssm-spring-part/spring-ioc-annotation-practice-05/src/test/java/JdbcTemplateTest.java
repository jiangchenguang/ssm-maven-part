import com.atguigu.controller.StudentController;
import com.atguigu.pojo.Student;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class JdbcTemplateTest {


    @Test
    public void testQueryAll() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        StudentController controller = context.getBean(StudentController.class);
        List<Student> students = controller.getStudentList();
        System.out.println(students);
        context.close();
    }
}
