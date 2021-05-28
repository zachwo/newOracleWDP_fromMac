package com.oop;

public class TestMethod {

    //两个数相加
    public int sum(int a, int b){
        return a+b;
    }

    public void subtraction(int a, int b){
        System.out.println(a-b);
    }

    public void multiplication(int a, int b){
        System.out.println(a*b);
    }

    public void division(double a,double b){
        System.out.println(a/b);
    }

    //定义一个方法，传入一个数，计算从1到其本身的累加和
    public int accumulate(int n){
        int sum = 0;
        for (int i = 1; i<= n ;i++){
            sum+=i;
        }
        return sum;
    }


    public static void main(String[] args) {
        TestMethod tm = new TestMethod();
        int sum = tm.sum(2,3);
        System.out.println(sum+10);
        tm.subtraction(2,3);
        tm.multiplication(2,3);
        tm.division(4,2);

        System.out.println(tm.accumulate(10));
    }
}
