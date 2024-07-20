package controller;

import pojo.Student;
import service.StudentService;

import java.util.List;

public class StudentController {

    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }

    private StudentService studentService;

    public List<Student> findAll () {
        List<Student> students = studentService.findAll();
        System.out.print("最终拿到的学员数据" + students);
        return students;
    }
}
