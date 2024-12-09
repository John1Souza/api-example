package com.dev.john.api_example;

@Service
public class HelloWorldService {
    public String helloWorld(String name) {
        return "Hello World" + name;
    }
}