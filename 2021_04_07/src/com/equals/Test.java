package com.equals;

// ==:比较地址是否相等
// String的equals是比较字符串的内容是否相等

import java.util.Objects;

public class Test {
    int age;

@Override
public boolean equals(Object obj){
    //return super.equals(obj);
    //按自己的规则重写equals方法：
    return age == ((Test)obj).age;
}


    public static void main(String[] args) {
        Object o = new Object();
        System.out.println(o.equals(o));
        System.out.println(o.equals("2133"));

        Test t = new Test();
        Test t2 = t;
        System.out.println(t.equals(t2));
    }

}
