package com.example.springbootmybatis.controller;


import com.example.springbootmybatis.entity.Student;
import com.example.springbootmybatis.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 功能:
 * 接口层
 *
 * @author :limingyang
 * @create ：
 * @created by IDEA
 */
@RestController
@EnableAutoConfiguration
@RequestMapping("/home")
public class TestBootController {
    @Autowired
    private StudentService studentService;
    @RequestMapping("getStudent")
    public List<Student> getUsers2() {
        return studentService.getStudent();
    }
}