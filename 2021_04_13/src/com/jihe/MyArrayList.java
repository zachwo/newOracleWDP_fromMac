package com.jihe;

import java.util.ArrayList;
import java.util.Arrays;

public class MyArrayList {
    private Object[] data;  //存放元素
    private int size;   //存放元素的个数

    //构造方法
    public MyArrayList(){
        //不同于局部变量，成员变量有初值，对于int类型的size来说初值就是0
        //size = 0;
        data = new Object[10];
    }
    //add方法
    public void add(Object o){
        //确定容量
        if(size+1 > data.length){
            //扩容
            int oldLength = data.length;
            int newLength = oldLength + oldLength>>1;
            if (newLength < size+1){
                newLength = size+1;
            }
            data = Arrays.copyOf(data,newLength);
        }
        data[size++] = o;
    }

    //get方法
    public Object get(int index){
        if (index<0 || index >=data.length){
            throw new ArrayIndexOutOfBoundsException();
        }
        return data[index];
    }
    //remove方法
    public void remove(int index){
        for (int i = index;i<data.length-1;i++){
            data[i] = data[i+1];
        }
        size -= 1;
    }

    public static void main(String[] args) {
        MyArrayList m = new MyArrayList();
        m.add("a");
        m.add("a");
        m.add("a");
        m.add("a");
        m.add("a");
        m.add("a");
        m.add("a");
        m.add("a");
        m.add("a");
        m.add("a");
        m.add("a");
        m.add("a");
        for (int i = 0;i < m.size;i++){
            System.out.println(m.get(i));
        }
    }
}
