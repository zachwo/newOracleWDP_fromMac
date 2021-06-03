package com.comparable;

public class Student {
    private String sno;
    private int age;
    private String name;
    private String banji;
    private String sex;
    private int fen;

    public Student() {
    }

    public Student(String sno, int age, String name, String banji, String sex, int fen) {
        this.sno = sno;
        this.age = age;
        this.name = name;
        this.banji = banji;
        this.sex = sex;
        this.fen = fen;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sno='" + sno + '\'' +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", banji='" + banji + '\'' +
                ", sex='" + sex + '\'' +
                ", fen=" + fen +
                '}';
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBanji() {
        return banji;
    }

    public void setBanji(String banji) {
        this.banji = banji;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getFen() {
        return fen;
    }

    public void setFen(int fen) {
        this.fen = fen;
    }
}
