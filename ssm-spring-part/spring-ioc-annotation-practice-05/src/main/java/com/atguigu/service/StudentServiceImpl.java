package com.atguigu.service;

import com.atguigu.dao.StudentDaoImpl;
import com.atguigu.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService  {

    @Autowired
    private StudentDaoImpl studentDao;

    @Override
    public List<Student> getStudents() {
        return studentDao.queryAll();
    }
}
