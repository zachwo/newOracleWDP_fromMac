package com.regular_expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//正则表达式
//https://www.runoob.com/java/java-regular-expressions.html
//https://www.w3cschool.cn/regexp/x9hf1pq9.html
public class Test {
    private static Pattern pattern1 = Pattern.compile("t[ae]{2}n");
    private static Pattern pattern2 = Pattern.compile("t[ae]?n");
    //验证一串数字是否是手机号
    private static Pattern pattern3 = Pattern.compile("1[35678][0-9]{9}");
    //验证字母数字密码长度不能低于6位
    private static Pattern pattern4 = Pattern.compile("[0-9a-zA-Z]{6,}");

    private static Pattern pattern5 = Pattern.compile("java.*");
    public static void main(String[] args) {
        Matcher matcher1 = pattern1.matcher("taan");
        boolean b = matcher1.matches();
        System.out.println(b);

        Matcher matcher2 = pattern2.matcher("taen");
        System.out.println(matcher2.matches());

        Matcher matcher3 = pattern3.matcher("18353736889");
        System.out.println(matcher3.matches());

        System.out.println(pattern4.matcher("1233ASds3456").matches());
        System.out.println(pattern5.matcher("javavvvaa").matches());
        System.out.println(pattern5.matcher("jav").matches());

    }
}
