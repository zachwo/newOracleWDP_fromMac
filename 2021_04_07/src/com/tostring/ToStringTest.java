package com.tostring;

public class ToStringTest {
    String name = "张三";
    int age = 14;

    @Override
    public String toString() {
        return "ToStringTest{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    public static void main(String[] args) {
        ToStringTest t = new ToStringTest();

        //object类中原始的toString方法一半都需要子类进行重写才有使用价值
        //以下两种写法是等价的
        System.out.println(t);
        System.out.println(t.toString());
    }
}
