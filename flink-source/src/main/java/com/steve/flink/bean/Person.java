package com.steve.flink.bean;

import lombok.Data;

@Data
public class Person {

    private String name;
    private long No;
    private int age;

    public Person() {
    }

    public Person(String name, long no, int age) {
        this.name = name;
        No = no;
        this.age = age;
    }
}
