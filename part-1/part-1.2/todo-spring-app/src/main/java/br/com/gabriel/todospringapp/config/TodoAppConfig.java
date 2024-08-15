package br.com.gabriel.todospringapp.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class TodoAppConfig implements ApplicationRunner {

    @Value("${server.port}")
    private int serverPort;

    @Override
    public void run(ApplicationArguments args) {
        System.out.println("Application started on port " + serverPort);
    }
}
