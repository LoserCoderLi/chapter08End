package com.ljh.extend_;

// 大学生  繁琐的很
public class Graduate {
    public String name;
    public int age;
    private double score;

    public void setScore(double score) {
        this.score = score;
    }
    public void testing(){
        System.out.println("大学生：" + name + "正在考数学");
    }
    public void showInfo(){
        System.out.println("学生" + name + ",年龄," + age + "成绩是" + score + "分");
    }
}
