package com;

public class Father extends GrandFather {
    String book = "Java编程思想";

    public Father(){
        System.out.println("创建了父类对象，调用的是无参数构造方法");
    }

    public void doBusiness(){
        System.out.println("父亲做生意");
    }

}
