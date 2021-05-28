package com.abstractLei;

/**
 * 抽象类不能new自己
 * 抽象类中可以有抽象方法，也可以有普通方法
 * 抽象方法只能写在抽象类和接口中
 * 抽象方法需要在其子类中重写
 * 抽象类的子类可以是普通类，也可以是抽象类
 */
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


