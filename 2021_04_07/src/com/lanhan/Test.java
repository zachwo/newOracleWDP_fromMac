package com.lanhan;

//设计模式：懒汉式单例模式
public class Test {
    public static void main(String[] args) {
        CommanderLazy cmdl = CommanderLazy.getInstance();
        CommanderLazy cmdl2 = CommanderLazy.getInstance();
        System.out.println(cmdl);
        System.out.println(cmdl2);
    }
}
