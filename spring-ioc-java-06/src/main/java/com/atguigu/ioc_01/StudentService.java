package com.atguigu.ioc_01;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
    public void queryAll () {
        System.out.println("service queryAll");
    }
}
