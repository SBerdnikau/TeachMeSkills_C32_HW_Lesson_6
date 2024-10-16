package com.teachmeskills.lesson_6.task_1;


public class Student {
    String name;
    String surname;
    int passportNumber;
    String groupName;
    int age;

    public Student(String name, String surname, int passportNumber, String groupName, int age) {
        this(name, surname, passportNumber, groupName);
        this.age = age;
    }

    public Student(String name, String surname, int passportNumber, String groupName) {
        this(name, surname, passportNumber);
        this.groupName = groupName;
    }

    public Student(String name, String surname, int passportNumber) {
        this.name = name;
        this.surname = surname;
        this.passportNumber = passportNumber;
    }
}
