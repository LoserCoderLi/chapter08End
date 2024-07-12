package com.ljh.extend_.improve_;

public class Student {
    public String name;
    public int age;
    private double score;

    public void setScore(double score) {
        this.score = score;
    }
    public void testing(){
        System.out.println("小学生：" + name + "正在考数学");
    }
    public void showInfo(){
        System.out.println("学生" + name + ",年龄" + age + "岁," + "成绩是" + score + "分");
    }
}
