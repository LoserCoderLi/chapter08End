package com.ljh.encap;

import java.util.Scanner;

public class Encapsulation {

    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(130);
        person.setName("1213456");
    }
}

class Person{
    public String name;
    private int age;
    private double salary;

    // 太慢
//    public void setAge(int age){
//        this.age = age;
//    }

    public Person(){

    }

    public Person(String name,int age,double salary){
        this.setAge(age);
        this.setName(name);
        this.setSalary(salary);
    }

    public void setName(String name) {
        while (true){
            if(name.length()>6 || name.length()<2){
                System.out.println("输入名称需要在[2,6]个字符之间,请重新输入：");
                Scanner scanner = new Scanner(System.in);
                name = scanner.next();

                continue;
            }
            break;

        }
        this.name = name;
    }

    public void setAge(int age) {
        while (true){
            if(age <1 || age>120){
                System.out.println("输入年龄需要在[1,120]之间,请重新输入：");
                Scanner scanner = new Scanner(System.in);
                age = scanner.nextInt();

                continue;
            }
            break;

        }
        this.age = age;
    }

    public void setSalary(double salary) {

        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public void inf0(){
        System.out.println("姓名：" + this.name + "年龄：" + this.age + "薪水：" + this.salary);
    }
}
