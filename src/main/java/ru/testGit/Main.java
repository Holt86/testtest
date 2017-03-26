package ru.testGit;

import java.util.Map;

/**
 * Created by user on 24.03.2017.
 */
public class Main {
    private String name;
    private String description;


    public static void main(String[] args) {
        Map<Integer, String> stringMap = Second.getMap();

        stringMap.merge(3, "Hi", (v1, v2) -> (v1 + v2) );

        System.out.println("==========================");

        stringMap.forEach((k, v) -> System.out.println(k + " - " + v));
    }

    public static void method1(){
        System.out.println("method1");
    }

}
