package com.exception;

public class NotEnoughMoneyException extends Exception{
    @Override
    public void printStackTrace() {
        System.out.println("不足100元异常");
    }
}
