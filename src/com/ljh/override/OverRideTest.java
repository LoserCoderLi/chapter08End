package com.ljh.override;

public class OverRideTest {
    public static void main(String[] args) {
        Person person = new Person("小红", 25);
        Student student = new Student("小白", 25, "372321211310232678", 99);

        System.out.println(person.say());
        System.out.println(student.say());
    }
}
