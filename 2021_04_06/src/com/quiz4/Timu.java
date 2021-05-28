package com.quiz4;

public class Timu {
    private String content; //题目内容
    private String option;  //题目选项
    private String answer;  //答案
    private int score;  //题目分值

    public Timu() {
    }

    public Timu(String content, String option, String answer, int score) {
        this.content = content;
        this.option = option;
        this.answer = answer;
        this.score = score;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
