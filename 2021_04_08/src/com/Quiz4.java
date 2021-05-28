package com;

//正反序输出字符串
public class Quiz4 {
    public static void main(String[] args) {
        String str = "abcdefg";
        char[] chars = str.toCharArray();
        String str1 = "";
        for (int i = chars.length-1 ; i >=0 ;i--){
            str1 += chars[i];
        }
        System.out.println(str+str1);
    }
}
