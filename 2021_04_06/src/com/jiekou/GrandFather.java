package com.jiekou;

public abstract class GrandFather {
    String book = "盗墓笔记";
    public GrandFather(){
        System.out.println("创建爷爷类");
    }

    public abstract void kaodaxue();

    public void xxx(){
        System.out.println("这是一个普通方法");
    }

}
