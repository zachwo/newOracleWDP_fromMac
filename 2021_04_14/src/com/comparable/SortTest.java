package com.comparable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SortTest {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0 ;i<10;i++){
            arr.add((int)(Math.random()*20));
        }
        for (int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
        //Collections.sort方法
        Collections.sort(arr);
        for (int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();

    }
}
