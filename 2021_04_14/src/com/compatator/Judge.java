package com.compatator;
import java.util.Comparator;
//相较于让Student类implements Comparable接口并重写compareTo方法，
//让Judge类implements Comparator<NewStudent>接口这种方法可以实现非侵入式添加新功能
//非侵入思想：在不改变原有代码的基础上利用其特点实现额外的功能
//MVC
public class Judge implements Comparator<NewStudent> {
    @Override
    public int compare(NewStudent o1, NewStudent o2) {
        return o1.getFen() - o2.getFen();
    }
}
