package com.lanhan;

public class CommanderLazy {
    private static CommanderLazy cmdl;

    private CommanderLazy(){
        System.out.println("创建了一个commanderLazy");
    }

    public static CommanderLazy getInstance(){
        if (cmdl == null){ //区别于饿汉式单例模式，延时加载
            cmdl = new CommanderLazy();
        }
        return cmdl;
    }
}
