package com.anhpv.springcicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class SpringCicdApplication {

    @GetMapping("/hello")
    public String welcome(){
        return "Hello world!";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringCicdApplication.class, args);
    }

}
