package com;

//Math 类练习
public class MathTest {
    public static void main(String[] args) {
        // 生成一个double类型的随机数，随机数范围为[0,1)
        System.out.println(Math.random());
        //取绝对值
        System.out.println(Math.abs(-20));
        //取整函数（四舍五入）
        System.out.println(Math.round(1.5));
        System.out.println(Math.round(1.4));
        System.out.println(Math.round(-1.4));

        System.out.println(Math.ceil(1.5)); //上取整
        System.out.println(Math.floor(1.5));//下取整
        System.out.println(Math.sqrt(4));   //平方根
        System.out.println(Math.cbrt(27));  //立方根
        System.out.println(Math.pow(2,3));  //2的3次方
    }
}
