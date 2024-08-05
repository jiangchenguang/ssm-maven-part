package atguigu.controller;

import atguigu.pojo.Student;
import atguigu.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    public List<Student> getStudentList() {
        return studentService.getStudents();
    }
}
