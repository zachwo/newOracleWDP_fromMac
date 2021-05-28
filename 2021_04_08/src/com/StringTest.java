package com;

import java.util.Arrays;

public class StringTest {
    public static void main(String[] args) {
        String str = "AbCdCef";
        System.out.println(str.length());   //字符串长度
        System.out.println(str.toLowerCase());  //转小写
        System.out.println(str.toUpperCase());  //转大写
        System.out.println(str.startsWith("Ab"));   //判断是否以xxx开始
        System.out.println(str.endsWith("ef")); //判断是否以xxx结束
        System.out.println(str.contains("d"));  //判断是否包含xxx字符串

        System.out.println(str.indexOf("C"));   //从左往右找第一次出现的索引位置
        System.out.println(str.lastIndexOf("C"));   //从左往右找最后一次次出s现的索引位置
        System.out.println( str.substring(2));  //从当前位置截取字符串（包含）
        System.out.println(str.substring(2,4)); //从当前位置截取字符串（包含），到目标位置（不含）

        //split() 拆分
        //String[] strings = "a-b-c-d-e-f".split("-");
        String[] strings = "a-b-c-d-e-f".split("-c-");
        System.out.println(Arrays.toString(strings));
        //replace()替换
        System.out.println("a,b,c,d".replace(","," "));
        //charAt(i)获取字符串特定位置上的字符
        for (int i = 0; i<"abc".length();i++){
            System.out.println("abc".charAt(i));
        }
        //toCharArray()将字符串转为字符数组
        char[] chars = "abc".toCharArray();
        System.out.println(Arrays.toString(chars));
        //trim()去除字符串左右两端的空格
        System.out.println("    sdff ffgg    ".trim());

    }
}
