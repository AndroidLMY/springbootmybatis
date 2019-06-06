package com.example.springbootmybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.springbootmybatis.dao")
//这里需要加@MapperScan("com.example.springbootmybatis.dao")来指定项目dao文件的存放的目录
public class SpringbootmybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootmybatisApplication.class, args);
    }

}
