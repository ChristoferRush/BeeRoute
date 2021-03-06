package com.rushedstudio.domino;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.rushedstudio.domino", "com.rushedstudio.domino.api"})
public class Application {

    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
    }
}
