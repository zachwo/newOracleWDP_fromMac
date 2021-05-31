package com.exception;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) throws NotEnoughMoneyException {
        //自定义异常
        int money = 1;
        if (money < 100){
            throw new NotEnoughMoneyException();
        }

    }
}
