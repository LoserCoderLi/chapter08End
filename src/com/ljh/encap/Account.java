package com.ljh.encap;

public class Account {
    private String name;
    private double balance;
    private String password;

    public Account(){

    }

    public Account(String name, double balance, String password) {
//        this.name = name;
//        this.balance = balance;
//        this.password = password;

        // 封装构造器
        this.setBalance(balance);
        this.setName(name);
        this.setPassword(password);
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String name) {
        if(name.length()==2 || name.length()==3 || name.length()==4){
            this.name = name;
        }
        else{
            System.out.println("姓名长度为2或3或4，你输入的不符合要求，请重新赋值");
        }
    }

    public void setBalance(double balance) {
        if (balance>20){
            this.balance = balance;
        }
        else{
            System.out.println("余额必须大于20，你输入的不规范，请重新赋值");
        }
    }

    public void setPassword(String password) {
        if (password.length() == 6){
            this.password = password;
        }
        else{
            System.out.println("密码必须是6位的，你输入不规范，赋默认值：123456");
            this.password = "123456";
        }
    }

    public void info(){
        System.out.println("name=" + name + "\t" + "balance=" + balance + "\t" + "password=" + password);
    }
}
