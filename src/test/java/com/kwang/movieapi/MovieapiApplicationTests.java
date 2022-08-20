package com.kwang.movieapi;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;

@SpringBootTest
class MovieapiApplicationTests {

    @Autowired
    private Environment environment;

    @Test
    void contextLoads() {
        System.out.println("Profile값 : "+ environment.getProperty("spring.profiles.active"));
        //No imple needed as we are simply loading the context
    }

}
