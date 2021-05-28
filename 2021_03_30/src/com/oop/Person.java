package com.oop;

public class Person {
    String name;
    String sex;
    int age;

//  构造方法：无返回值类型
//  修饰符  方法名/类名(参数列表)
    public Person(){
        System.out.println("创建了Person对象,执行无参数构造方法");
        this.name = "abc";  //this.name指上面的name属性
    }
//  有参数的构造方法
    public Person(String name, String sex, int age){
        System.out.println("创建了Person对象,执行了有参数的构造方法");
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

//  普通方法
//  修饰符 返回类型 方法名（参数列表）
    public void eat(String food,int num){
        System.out.println("吃了"+num+"个"+food);
    }

}
