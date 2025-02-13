package com.guanmengyuan.spring.ex.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.guanmengyuan.spring.ex.demo.mapper")
public class SpringExDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringExDemoApplication.class, args);
    }

}
