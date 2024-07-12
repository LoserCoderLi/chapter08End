package com.ljh.modifier;

public class B {

    public void say(){
        A a = new A();
        // 在同一个包下可以访问的 public protected 默认  不能访问私有的属性和方法
        System.out.println(a.n1 + a.n2 + a.n3 );
    }
}
