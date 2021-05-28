package com;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;

public class TimeTest {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d.getYear()+1900);   //获取年，1900年为元年
        System.out.println(d.getMonth()+1);     //获取月，月份从0开始
        System.out.println(d.getDate());        //获取日

        String x = d.toLocaleString();          //获取本地当前的日期时间
        System.out.println(x);

        //自定义时间输出的格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd\tHH:mm:ss");
    }
}
