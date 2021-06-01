package com.jihe;

import java.util.ArrayList;

//去除集合中的重复元素
public class RemoveDuplicate {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("a");
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("c");
        list.add("a");
        for (int i = 0 ; i<list.size(); i++){
            for (int j = i+1 ; j<list.size(); j++){
                if (list.get(i).equals(list.get(j))){
                    list.remove(j);
                    j--;    //注意j--
                }
            }
        }
        System.out.println(list);
    }
}
