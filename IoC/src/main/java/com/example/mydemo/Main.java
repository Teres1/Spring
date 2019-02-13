package com.example.mydemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Main.class);

        Application app = context.getBean(Application.class);
        app.run();
    }

    @Bean
    public Logger logger() {
        return new ConsoleLogger();
    }

    @Bean
    public Logger fileLogger() {
        return new FileLogger();
    }

    @Bean
    public Application application() {
        return new Application(logger());
    }
}
