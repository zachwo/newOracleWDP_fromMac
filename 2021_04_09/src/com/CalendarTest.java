package com;

import java.util.Calendar;

public class CalendarTest {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        //System.out.println(c.getWeeksInWeekYear()); //今年总共有多少周
        System.out.println(c.get(Calendar.DATE));       //获取日
        System.out.println(c.get(Calendar.MONTH)+1);    //获取月（月份从0开始）
        System.out.println(c.get(Calendar.YEAR));       //获取年
        System.out.println(c.get(Calendar.DAY_OF_WEEK));    //本周第几天（start with Sunday）
        System.out.println(c.get(Calendar.DAY_OF_MONTH));   //本月第几天
        System.out.println(c.get(Calendar.DAY_OF_YEAR));    //今年第几天
        System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH));   //本月第几周




    }
}
