package com.hashcode;

public class TestObject {
    @Override
    public int hashCode() {
        return 12345;
    }

    public static void main(String[] args) {
        TestObject to = new TestObject();
        TestObject to1 = new TestObject();

        //hashCode是一个与对象内存地址有关的一个数
        //如果两个对象的hashCode不一样，则这两个对象一定不是一个对象
        System.out.println(to.hashCode());
        System.out.println(to1.hashCode());
        //如果两个对象的hashCode一样，这两个对象不一定是一个对象
        // 原因有很多，其中之一是子类有可能会重写hashCode方法，
        // 另一个原因是散列算法设计问题。eg.散列算法为x%3 ：5%3 == 8%3
    }
}
