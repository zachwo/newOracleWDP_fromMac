package com.quiz3;

public class StaticDemo {
    int num1 = 10;
    static int num2 = 5;
    public static void main(String[] args) {
        StaticDemo st = new StaticDemo();
        StaticDemo.num2 = 33;
        //st.num2 = 10; // 错误，不应该通过类实例访问静态成员，而应该用类名.属性/类名.方法调用静态属性或方法
        System.out.println(st.num1);
        System.out.println(StaticDemo.num2);
    }
}
