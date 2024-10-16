package com.edunetric;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
@SpringBootApplication
@EntityScan(basePackages = "com.edunetric.entity")

public class EduNetricApplication {

    public static void main(String[] args) {
        SpringApplication.run(EduNetricApplication.class, args);
    }

}