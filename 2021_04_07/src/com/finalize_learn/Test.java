package com.finalize_learn;

//finalize用于进行垃圾回收(了解即可，jdk8后的版本已将其作废)
//垃圾：没有地址指向的对象
//eg. Student s = new Student();    t = null;
//此时new的Student()对象就没有了地址指向， 就是垃圾
//System.gc()用于进行垃圾回收
//当使用System.gc()的时候会自动调用finalize方法进行善后工作
public class Test {
    @Override
    protected void finalize() throws Throwable {
        System.out.println("回收了"+ hashCode());
    }

    public static void main(String[] args) {
        Test t = new Test();
        Test t1 = new Test();

        t = null;
        System.gc();
        System.out.println("xxxxxxxxxxxxxxxxxx");
    }
}
