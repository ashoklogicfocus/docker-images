package org.example;

import java.security.PublicKey;

@sprinboot application
@restcontroller
public class Main {
    @Getmapping("/hello")
    public String hello(){
        return "hello to jdk !";
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}