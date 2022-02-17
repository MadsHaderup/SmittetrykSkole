package com.example.smittetryk01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.batch.BatchAutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Conditional;

@SpringBootApplication
@AutoConfigureBefore
public class Smittetryk01Application {

    public static void main(String[] args) {
        SpringApplication.run(Smittetryk01Application.class, args);
    }

}
