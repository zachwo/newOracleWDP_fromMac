package com.jiekou;

import duotai.Cat;

import java.io.Serializable;
import java.security.PublicKey;

public class Test {
    public static void main(String[] args) {
//        Father father = new Father();
//        father.getMarried();
//        father.doBusiness();

        //除非使用匿名内部类，否则接口new对象的时候只能使用其子类形式(即用多态形式处理接口对象)
//        GodGrandFather gd = new GodGrandFather() {
//            @Override
//            public void veryLihai() {
//                System.out.println("sss");
//            }
//
//            @Override
//            public void findWife() {
//                System.out.println("xxx");
//            }
//        };
//        GodGrandMa gm = new Father();
//        gm.findWife();

        Father father = new Father();
        father.xxx("sssss");

        Cat cat = new Cat();
        // 只要实现了序列化接口的子类都能够放入xxx()方法
        father.xxx(cat);
    }


}
