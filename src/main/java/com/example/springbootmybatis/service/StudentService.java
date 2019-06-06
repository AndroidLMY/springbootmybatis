package com.example.springbootmybatis.service;

import com.example.springbootmybatis.dao.StudentDao;
import com.example.springbootmybatis.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 功能:
 * 业务逻辑处理层
 * @author :limingyang
 * @create ：
 * @created by IDEA
 */

@Service
public class StudentService {


    @Autowired
    private StudentDao studentDao;

    public List<Student> getStudent() {
        return studentDao.selectStudents();
    }
}
