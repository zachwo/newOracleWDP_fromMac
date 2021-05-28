package com;

public class Quiz2 {
    /**
     *     求出字符串中有多少字符，以及每个字符的个数
     */
    public static void main(String[] args) {
        String str = "apple is a apple.";
        char[] chars = str.toCharArray();
        char[] neatchars = new char[chars.length];
        int[] charnum = new int[chars.length];

        int count = 0;  //记录字符串的种类数
        for (int i = 0; i<chars.length; i++){
            boolean flag = true;
            for (int j = 0 ;j<count;j++){
                if (neatchars[j] == chars[i]){
                    charnum[j]++;
                    flag = false;
                    break;
                }
            }
            if (flag){
                neatchars[count] = chars[i];
                charnum[count]=1;
                count ++;
            }
        }
        for (int i = 0 ; i < count ; i++){
            System.out.println(neatchars[i]+":\t"+charnum[i]);
        }
    }
}
