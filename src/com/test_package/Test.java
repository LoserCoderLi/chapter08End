package com.test_package;

import com.ljh.modifier.A;

public class Test {

    public static void main(String[] args) {
        // 不同包下，只能方法public修饰的属性和方法，不能访问别的
        A a = new A();
        System.out.println(a.n1);
    }
}
