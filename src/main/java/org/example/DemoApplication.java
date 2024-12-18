package org.example;

import java.util.regex.Pattern;

public class DemoApplication {
    public static void main(String[] args) {
        Pattern.compile("[a-z]+").matcher("test").matches();
        System.out.println("Hello, Error Prone!");
    }
}

