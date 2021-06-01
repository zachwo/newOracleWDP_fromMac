package com.collection;

import java.util.ArrayList;

//ArrayList
//add(值)
//get(index)获取对应位置的元素值
//size()获取集合元素的个数
public class Test {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("a");
        list.add(1);
        list.add(true);
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.size());
        for (int i = 0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
