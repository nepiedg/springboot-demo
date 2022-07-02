package com.example.d2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
@MapperScan("com.example.d2.mapper")
@SpringBootApplication
public class D2Application {

    public static void main(String[] args) {
        SpringApplication.run(D2Application.class, args);
    }

}
