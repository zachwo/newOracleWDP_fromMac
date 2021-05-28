package com.string;
//StringBuffer用法同StringBuilder
//但是StringBuffer线程安全，速度慢
//StringBuilder线程不安全，速度快


public class StringBufferTest {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("123");
        sb.append("123");
        System.out.println(sb);
    }
}
