package com.abstractLei;

public class Test {
    public static void main(String[] args) {
        //抽象类不能这么写：
        //GrandFather gf = new GrandFather();

        //匿名内部类:用一次就作废，框架阶段会很常用，暂时不深究
//        GrandFather gf = new GrandFather() {
//            @Override
//            public void kaodaxue() {
//                System.out.println("爷爷读大学");
//            }
//        };

        //抽象类不能直接new自己，可以new自己的非抽象子类
        GrandFather f = new Father();
        f.kaodaxue();
        f.xxx();

        //对：
        //Father f2 = new Father();
        //错：
        //Uncle u = new Uncle();
        Uncle cousin = new Cousin();
        cousin.kaodaxue();
        cousin.doBusiness();

        GrandFather son = new Son();
        son.kaodaxue();
    }
}
