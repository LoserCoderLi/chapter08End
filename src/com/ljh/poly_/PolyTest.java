package com.ljh.poly_;

public class PolyTest {
    public static void main(String[] args) {
        Master master = new Master("小红");
        Fish fish = new Fish("黄花鱼");
        Bone bone = new Bone("大排骨");
        Dog dog = new Dog("大黄狗");
        Cat cat = new Cat("小花猫");

        master.feed(dog, bone);
        master.feed(cat, fish);
    }
}
