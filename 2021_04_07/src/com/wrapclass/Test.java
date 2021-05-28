package com.wrapclass;

import javax.sound.midi.Soundbank;

/**
 * int  ->  Integer
 * char ->  Character
 * byte ->  Byte
 * short    ->  Short
 * long ->  Long
 * float    ->  Float
 * double   ->  Double
 * boolean  ->  Boolean
 */
public class Test {
    public static void main(String[] args) {
        //输出int类型整数的最大值
        System.out.println(Integer.MAX_VALUE);
        //将十进制数字转为二进制
        System.out.println(Integer.toBinaryString(5));
        //将十进制数字转换为十六进制
        System.out.println(Integer.toHexString(17));

        int i = 1;
        String x = "1";
        int xx = Integer.parseInt(x);
        System.out.println(i+x);    //字符串拼接
        System.out.println(i+xx);   //整数相加

        double d = Double.parseDouble("123.456");
        System.out.println(d+200);

    }
}
