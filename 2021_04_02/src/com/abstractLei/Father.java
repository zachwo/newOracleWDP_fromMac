package com.abstractLei;

public class Father extends GrandFather{


    public Father(){
        System.out.println("创建父亲类");
    }
    @Override
    public void kaodaxue() {
        System.out.println("父亲考上大学");
    }

}
