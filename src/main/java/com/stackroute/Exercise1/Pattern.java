package com.stackroute.Exercise1;

public class Pattern {
    public String  printPattern(int number){
        int j;
        int k=0;
        String s1="";
        for (int i = 1; i <= number; i++) {
            for (j = 1; j <= i;j++ ) {
                s1=s1+i+" ";
            }
        }
        return s1;
    }
}
