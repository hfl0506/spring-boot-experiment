package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student marium = new Student(
                    "Marium",
                    "marium@gmail.com",
                    LocalDate.of(2000, Month.MAY, 5)
            );

            Student ronnie = new Student(
                    "ronnie",
                    "ronnie@gmail.com",
                    LocalDate.of(1993, Month.MAY, 6)
            );

            repository.saveAll(
                    List.of(marium, ronnie)
            );
        };
    }
}
