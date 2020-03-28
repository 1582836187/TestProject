package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author hw
 * @version 1.0
 * @date 2020/3/24 20:04
 */
@SpringBootApplication
@EnableScheduling
public class SpringTestProjectApplication {

    public static void main(String[] args) {
        System.out.println(SpringApplication.run(SpringTestProjectApplication.class,args));
    }
}
