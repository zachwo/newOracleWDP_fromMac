package com.quiz2;

public class Test {

    public static void main(String[] args) {
        Circle circle = new Circle("red",1, 2);
        MyRectangle myRectangle = new MyRectangle("blue",1, 2, 3);
        System.out.println(equalsArea(circle,myRectangle));
    }

    public static boolean equalsArea(Jihe j1, Jihe J2){
        return j1.findArea()== J2.findArea();
    }


}
