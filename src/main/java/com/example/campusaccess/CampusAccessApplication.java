package com.example.campusaccess;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.CampusAccess.dao")
public class CampusAccessApplication {

    public static void main(String[] args) {
        SpringApplication.run(CampusAccessApplication.class, args);
    }

}
