package com.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello from Java 21!");

        // Java 21 - Pattern Matching for switch (stable)
        Object obj = "Hello";
        String result = switch (obj) {
            case Integer i -> "Integer: " + i;
            case String s  -> "String: " + s;
            default        -> "Unknown";
        };
        System.out.println(result);
    }
}
