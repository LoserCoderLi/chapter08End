// 类所在位置
package com.test_package;

//import java.util.Scanner;// 导入Scanner类
//import java.util.*; // 导入全部类


import java.util.Arrays;

public class import01 {

    public static void main(String[] args) {
        // 使用系统提供的 Arrays 类完成 数组排序
        int[] arr = {5, 6, 7, 5, 9, 1, -1, -88, 20};
        Arrays.sort(arr);
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + "\t");
        }
        System.out.print("");
    }
}
