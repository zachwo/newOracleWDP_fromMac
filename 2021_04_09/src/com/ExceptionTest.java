package com;

/**
 * 1.try 可以和 catch() finally{} 搭配使用
 * 2.try 可以配合多个catch 最多只能和一个finally 搭配
 * 3.try 不能单独使用
 */
public class ExceptionTest {
    public static void main(String[] args) {
        int[] arr = new int[3];
        System.out.println(arr[0]);
        int i = 2;

        try {
            System.out.println(arr[i]);
            String str = null;
            System.out.println(str.length());
        }catch (NullPointerException e){
            System.out.println("出错，空指针异常");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("出错，数组越界异常");
        }catch (Exception e){   //因为Exception是各种异常的父类，所以Exception必须作为兜底最后进行catch
            System.out.println("无论出了什么异常，在此处都能接住");
        }finally {
            System.out.println("无论是否出错，一定会执行此句");
        }

//        try {
//            System.out.println(arr[i]);
//            String str = null;
//            System.out.println(str.length());
//        }catch (Exception e){
//            System.out.println("出现了未知异常，在此处进行catch");
//        }finally {
//            System.out.println("无论是否出错，一定会执行此句");
//        }
        System.out.println("~~~~~~~~~~~");
    }

}
