package com.example.springbootmybatis.dao;


import com.example.springbootmybatis.entity.Student;

import java.util.List;

/**
 * 功能:
 * Dao层
 * @author :limingyang
 * @create ：
 * @created by IDEA
 */

public interface StudentDao {
    //selectStudents()方法名需要和对应的mapper.xml中的 id相同
    List<Student> selectStudents();
}
