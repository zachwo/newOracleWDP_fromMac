package com;

public class Quiz3 {
    /**
     * 去掉字符串的右边空格
     * @param args
     */
    public static void main(String[] args) {
        String str = "   XXXX XX XX    ";
        char[] chars = str.toCharArray();
        int index = chars.length;
        while (chars[index-1] == ' '){
            index--;
        }
        System.out.println(str.substring(0, index));
    }
}
