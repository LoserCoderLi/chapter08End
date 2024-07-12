package com.ljh.poly_;

public class Master {
    private String name;

    public Master(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void feed(Animal animal, Food food){
        System.out.println("主人" + this.getName() + " " + "给" + animal.getName() + "喂" + food.getName());
    }
}
