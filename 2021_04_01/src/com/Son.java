package com;

public class Son extends Father{
    String book = "蜡笔小新";

    public Son(){
//        super(); //第一行隐含super()，即父类的无参数构造方法
        System.out.println("创建了儿子对象，调用的是无参数的构造方法");
    }

    public void readBook(){
        System.out.println("儿子读书读的是"+ super.book);
    }

    @Override
    public void doBusiness() {
        System.out.println("儿子做生意");
    }
}
