package com.yal;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.web.socket.config.annotation.EnableWebSocket;

@SpringBootApplication
@MapperScan("com.yal.dao")
@EnableCaching
@EnableWebSocket
public class TestspringApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestspringApplication.class, args);
    }

}
