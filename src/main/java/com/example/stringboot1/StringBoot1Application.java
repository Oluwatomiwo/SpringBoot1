package com.example.stringboot1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;



@SpringBootApplication
@RestController
public class  StringBoot1Application {

    public static void main(String[] args) {

        SpringApplication.run(StringBoot1Application.class, args);
    }


}