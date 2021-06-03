package com.comparable;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        //比较两个学生的分数信息
        //按照学生的分数，从小到大排列
        Student s1 = new Student("001", 22,"张三","一班","男",88);
        Student s2 = new Student("002", 22,"李四","一班","男",99);
        Student s3 = new Student("003", 22,"王武","七班","男",100);
        Student s4 = new Student("004", 22,"赵六","七班","女",59);
        Student s5 = new Student("005", 22,"孙七","七班","女",99);
        Student s6 = new Student("006", 22,"刘八","七班","女",79);

        ArrayList<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        list.add(s6);

        for (int i = 0 ; i<list.size()-1 ;i++){
            for (int j = i+1 ;j<list.size();j++){
                if (list.get(i).getFen()>list.get(j).getFen()){
                    Student t = list.get(i);
                    list.set(i,list.get(j));
                    list.set(j,t);
                }
            }
        }
        for (Student s:list){
            System.out.println(s);
        }



    }
}
