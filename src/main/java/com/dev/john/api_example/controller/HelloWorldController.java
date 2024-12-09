package com.dev.john.api_example;

@RestController //Indica que a classe é um REST Controller, combina as anotações @Controller e @ResponseBody
@RequestMapping("/hello-world")
public class HelloWorldController {
    public 


    // post, get, delete, put, patch, options, head
    @GetMapping("/get") //GET /hello-world
    public String helloWorld() {
        return "Hello World";
    }
}