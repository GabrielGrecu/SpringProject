package com.gabriel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {


    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }



//    @GetMapping("/greet")
//    public GreetResponse greet(@RequestParam(value = "name", required = false) String name){
//        String greetMessage = name == null || name.isBlank() ? "Hello" : "Hello " + name;
//
//        GreetResponse greetResponse = new GreetResponse(
//                greetMessage,
//                List.of("Java", "Golang", "Js"),
//                new Person("Alex", 28, 30_000)
//        );
//        return greetResponse;
//    }
//
//    record Person(String name, int age, double savings){}
//
//    record GreetResponse(
//            String greet,
//            List<String> favProgramming,
//            Person person
//    ){}
}
