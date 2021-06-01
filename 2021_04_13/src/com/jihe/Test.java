package com.jihe;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("a");
        list.add("b");
        list.add("c");  //添加元素到最后面
        for (int i = 0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        list.add(0,"q");//添加元素到指定位置
        list.set(0,"l");    //更新指定位置的元素
        list.clear();//list
        System.out.println(list.contains("a"));//判断是否含有该元素
        System.out.println(list.indexOf("c"));  //返回"c"在list中出现的第一个位置
        System.out.println(list.lastIndexOf("c"));





    }
}
