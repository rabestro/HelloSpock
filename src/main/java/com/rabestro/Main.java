package com.rabestro;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.hello("Spock"));

    }

    String hello(final String name) {
        return "Hello, " + name + "!";
    }
}
