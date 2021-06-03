package com;

import java.lang.reflect.GenericArrayType;
import java.util.ArrayList;
import java.util.Stack;
import java.util.Vector;
public class Test {
    public static void main(String[] args) {
        //Vector Arraylist功能完全一样，但是Vector线程安全，不常用，了解
//        Vector<String> v = new Vector();
//        v.add("a");
//        System.out.println(v.get(0));

        //Stack栈，先进后出
//        Stack s = new Stack();
//        s.add("a");
//        s.add("b");
//        s.add("c");
//        System.out.println(s.size());
//        System.out.println("pop: "+s.pop());    //pop拿出栈顶元素，栈元素减1
//        System.out.println(s.size());
//        System.out.println("peek: "+s.peek());  //peek查看栈顶元素，栈元素不变

        //Arraylist冒泡排序
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0 ; i<10 ;i++){
            list.add((int) (Math.random()*100));
        }
        for (int i:list) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0 ; i<list.size()-1;i++){
            for (int j = i+1;j<list.size();j++){
                if (list.get(i) > list.get(j)){
                    int tem = list.get(i);
                    list.set(i,list.get(j));
                    list.set(j,tem);
                }
            }
        }
        for (int i:list) {
            System.out.print(i + " ");
        }
        System.out.println();

        //



    }
}
