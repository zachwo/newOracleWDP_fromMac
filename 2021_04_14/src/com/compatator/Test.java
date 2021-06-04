package com.compatator;

import com.comparable.Student;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        NewStudent s1 = new NewStudent("001", 22,"张三","一班","男",88);
        NewStudent s2 = new NewStudent("002", 22,"李四","一班","男",99);
        NewStudent s3 = new NewStudent("003", 22,"王武","七班","男",100);
        NewStudent s4 = new NewStudent("004", 22,"赵六","七班","女",59);
        NewStudent s5 = new NewStudent("005", 22,"孙七","七班","女",99);
        NewStudent s6 = new NewStudent("006", 22,"刘八","七班","女",79);

        ArrayList<NewStudent> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        list.add(s6);


        Judge judgeFen = new Judge();
        Collections.sort(list,judgeFen);
        for (NewStudent s:list){
            System.out.println(s);
        }
    }
}
