package com;

public class Quiz1 {
    public static void main(String[] args) {
        String ID = "370829199903114916";

        char ch = ID.charAt(ID.length()-2);
        int x = Integer.parseInt(ch+"");
        if (x%2 == 1){
            System.out.println("男");
        }else {
            System.out.println("女");
        }
        System.out.println("出生年：\t"+ID.substring(6,10));
        System.out.println("出生月：\t"+ID.substring(10,12));
        System.out.println("出生日：\t"+ID.substring(12,14));

    }
}
