package com.ljh.extend_.improve_;

public class Extends {
    public static void main(String[] args) {
        Pupil pupil = new Pupil();
        Graduate graduate = new Graduate();
        pupil.name = "xiaoming";
        pupil.age = 10;
        pupil.testing();
        pupil.setScore(99);
        pupil.showInfo();

        graduate.name = "xiaoqiang";
        graduate.age = 20;
        graduate.testing();
        graduate.setScore(99);
        graduate.showInfo();
    }
}
