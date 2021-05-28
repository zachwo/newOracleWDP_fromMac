package com;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;

public class TimeTest {
    public static void main(String[] args) {
        Date d = new Date();
//        System.out.println(d.getYear()+1900);   //获取年，1900年为元年
//        System.out.println(d.getMonth()+1);     //获取月，月份从0开始
//        System.out.println(d.getDate());        //获取日

        //获取本地当前的日期时间
        String x = d.toLocaleString();
        System.out.println(x);

        //自定义时间输出的格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd\tHH:mm:ss");
        String x1 = sdf.format(d);
        System.out.println(x1);

        //构建日期类型
        try {
           Date dd = sdf.parse("2021年05月28日");
            System.out.println(dd.getDate());
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
