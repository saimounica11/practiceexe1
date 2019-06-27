package com.stackroute.Exercise1;
import java.util.Scanner;

public class Random {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int sum=0;
        while (scan.hasNext() && (!("\n").equals(scan.hasNext()))) {
            sum = sum + scan.nextInt();

        }

        System.out.println(sum);
    }
}

