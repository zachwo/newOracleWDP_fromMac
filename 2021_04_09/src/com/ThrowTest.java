package com;

/**
 *  throw是抛出异常，throws是声明异常
 *  RuntimeException运行时异常（例如NullPointerException） 可以不用管
 *  非运行时异常/受检查异常（例如Exception）必须进行处理：要么进行try catch，要么使用throws声明异常
 */
public class ThrowTest {
    public static void main(String[] args) throws Exception {
        //NullPointerException e = new NullPointerException();
        //throw e;
        //抛出异常后程序结束，下面的代码不会被执行
        //System.out.println("此行不会被输出");


        try {
            throw new NullPointerException();
        }catch (NullPointerException ee){
            System.out.println("接住了空指针异常，程序可以继续执行");
        }
        System.out.println("此行会被输出");

//        非运行时异常/受检查异常：只throw会报错
//        throw new Exception();
//        解决方法一：try catch
//        try {
//            throw new Exception();
//        }catch (Exception e){
//            System.out.println("接住了Exception");
//        }
//        解决方法二：在main()方法后面throws声明异常
        throw new Exception();
    }
}
