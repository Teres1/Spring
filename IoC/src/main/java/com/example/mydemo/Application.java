package com.example.mydemo;


public class Application {
    private Logger logger;

    public Application(Logger logger) {
        this.logger = logger;
    }

    public void run() {
        logger.logMessage("Hello World!");
    }
}
