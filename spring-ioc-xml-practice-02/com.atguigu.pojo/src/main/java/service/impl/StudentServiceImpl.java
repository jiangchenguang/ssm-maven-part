package service.impl;

import dao.StudentDao;
import pojo.Student;
import service.StudentService;

import java.util.List;

public class StudentServiceImpl implements StudentService {

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    StudentDao studentDao;

    @Override
    public List<Student> findAll() {
        List<Student> students = studentDao.queryAll();
        return students;
    }
}
