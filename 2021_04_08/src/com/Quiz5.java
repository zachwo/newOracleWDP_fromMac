package com;

//字符串移动n位输出
public class Quiz5 {
    public static void main(String[] args) {
        String str = "hello world";
        System.out.println(moveToLeft(str,12));
        System.out.println(moveToLeft(str,1));
        System.out.println(moveToRight(str,12));
        System.out.println(moveToRight(str,1));
    }

    /**
     * 字符串左移
     * 注意position可能会大于str.length()的bug
     * @param str 需要移动的字符串
     * @param position 左移的位数
     * @return
     */
    public static String moveToLeft(String str, int position){
        if (position>str.length()){
            position %= str.length();
        }
        String newStr = "";
        newStr = str.substring(position);
        newStr += str.substring(0,position);
        return newStr;
    }
    /**
     * 字符串右移
     * 注意position可能会大于str.length()的bug
     * @param str 需要移动的字符串
     * @param position 右移的位数
     * @return
     */
    public static String moveToRight(String str, int position){
        if (position>str.length()){
            position %= str.length();
        }
        String newStr = "";
        newStr += str.substring(str.length()-position );
        newStr += str.substring(0,str.length()-position);
        return newStr;
    }
}
