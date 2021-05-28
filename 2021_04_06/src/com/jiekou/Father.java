package com.jiekou;

import java.io.Serializable;

/**
 * 如果GodGrandFather 接口继承了 GodGrandMa接口，则Father类只需要implements一个GodGrandFather，
 * 否则需要implements GodGrandFather，GodGrandMa
 */
public class Father extends GrandFather implements GodGrandFather{
    public Father(){
        System.out.println("创建父亲类");
    }
    @Override
    public void kaodaxue() {
        System.out.println("父亲考上大学");
    }

    @Override
    public void veryLihai() {
        System.out.println("报个名号");
    }

    public void doBusiness(){
        veryLihai();
        System.out.println("父亲做生意");
    }

    @Override
    public void findWife() {
        System.out.println("见面、看电影、约会、吃饭、聊天... 结婚生子");
    }

    public void getMarried(){
        findWife();
        System.out.println("有了儿子");
    }

    //序列化接口Serializable
    public void xxx(Serializable s){
        System.out.println(s);
    }
}
