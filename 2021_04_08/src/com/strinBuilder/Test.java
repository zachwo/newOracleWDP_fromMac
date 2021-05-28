package com.strinBuilder;

//SB系列：
//  StringBuilder
//  StringBuffer
public class Test {
    public static void main(String[] args) {
        //StringBuilder用于字符串拼接
        //解决String字符串不支持修改的问题（每次修改后的字符串其实都是新的字符串）
        //String 字符串不适用于多个字符串之间的拼接操作（因为需要频繁的创建新的字符串）

        //String字符串创建后不可变，修改后的String字符串实际上是一个新的字符串
        //对于频繁的字符串操作建议使用StringBuilder
        //StringBuilder创建后可变
        //StringBuilder 线程不安全   速度快
        //StringBuffer  线程安全    速度慢（下一章节讲解）

        String str = "abcde";
        StringBuilder sb = new StringBuilder(str);

        //append():字符串追加
        //通过查看append()源码可以得知append方法返回的是this（即StringBuilder对象本身），所以append方法支持链式反应
        sb.append("12345").append("wasd");
        System.out.println(sb);

        //insert(position,str)指定位置插入
        sb.insert(0,"哈哈哈哈哈");
        System.out.println(sb);

        //reverse()反转字符串
        sb.reverse();
        System.out.println(sb);

        //delete(start, end):删除从start（包含）到end（不包含）的字符串
        sb.delete(1,2);
        System.out.println(sb);

        //replace(start, end, str):将start（包含）到end（不包含）的字符串替换为str
        sb.replace(0,3,"qq");
        System.out.println(sb);

        //deleteCharAt(index)
        sb.deleteCharAt(0);
        System.out.println(sb);

    }
}
