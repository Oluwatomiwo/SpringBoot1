package com.example.stringboot1.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository){
        return args -> {
            Student segun = new Student(
                    1L,
                    "Segun",
                    "segunlasisi@gmail.com",
                    LocalDate.of(1999, Month.AUGUST, 4)

            );

            Student alex = new Student(
                    2L,
                    "Alex",
                    "alexgrover@gmail.com",
                    LocalDate.of(1994, Month.DECEMBER, 3)

            );
            Student dayo = new Student(
                    3L,
                    "Dayo",
                    "oluwadayo@gmail.com",
                    LocalDate.of(1997, Month.APRIL, 7)

            );

            repository.saveAll(
                    List.of(segun, alex, dayo)
            );
        };
    }
}
