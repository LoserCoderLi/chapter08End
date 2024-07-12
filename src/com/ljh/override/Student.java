package com.ljh.override;

public class Student extends Person{
    private String id;
    private int score;

    public void setId(String id) {
        this.id = id;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Student(String name, int age, String id, int score) {
        super(name, age);
        this.setId(id);
        this.setScore(score);
    }

    public String say(){
        return "Student:" + "大家好！我是" + super.getName() + "，今年" + super.getAge() + "岁！";
    }

    public String getId() {
        return id;
    }

    public int getScore() {
        return score;
    }
}
