package com.bp.flywayshiro;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@Slf4j
@SpringBootApplication
public class FlywayShiroApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(FlywayShiroApplication.class, args);
        String serverPort = context.getEnvironment().getProperty("server.port");
        System.out.println("** The flywayShiro server started at http://localhost:" + serverPort + " **");
    }

}
