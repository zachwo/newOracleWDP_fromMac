package com.quiz4;

import java.util.Scanner;

public class TestMachine {
    private Timu[]  totalQuiz;  //总题库
    private Timu[] temporaryQuiz = new Timu[3];//临时题库

    //通过构造方法进行属性的赋值
    public TestMachine(){
        totalQuiz = new Timu[5];
        Timu t1 = new Timu("1+1=?", "A.1 B.2 C.3 D.4", "B", 5);
        Timu t2 = new Timu("1+2=?", "A.1 B.2 C.3 D.4", "C", 5);
        Timu t3 = new Timu("1+3=?", "A.1 B.2 C.3 D.4", "D", 5);
        Timu t4 = new Timu("1+4=?", "A.1 B.5 C.3 D.4", "B", 5);
        Timu t5 = new Timu("1+5=?", "A.1 B.2 C.6 D.4", "C", 5);
        totalQuiz =new Timu[]{t1,t2,t3,t4,t5};


    }
    public void chuti(){    //出题
        for (int i = 0 ; i<temporaryQuiz.length ;i++){
            int index = (int)(Math.random()*totalQuiz.length);
            temporaryQuiz[i] = totalQuiz[index];
        }
    }
    //考试方法
    public void kaoshi(){
        chuti();
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i< temporaryQuiz.length ;i++){
            System.out.println(temporaryQuiz[i].getContent());
            System.out.println(temporaryQuiz[i].getOption());
            System.out.println("请输入答案；");
            String answer = sc.next();
            //equalsIgnoreCase():不区分大小写匹配字符串
            if (answer.equalsIgnoreCase(temporaryQuiz[i].getAnswer())){
                sum += temporaryQuiz[i].getScore();
            }
        }
        System.out.println("总得分："+sum);
    }

}
