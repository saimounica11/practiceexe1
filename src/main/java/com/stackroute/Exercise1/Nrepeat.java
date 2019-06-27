package com.stackroute.Exercise1;
import java.util.Scanner;

public class Nrepeat {
    public static String subString(String input1,int input2)
    {
        int length=input1.length();
        String substring;
        if(input2<length) {
            substring = input1.substring(length - input2, length);
            for (int i = 0; i < input2; i++) {
                input1 = input1.concat(substring);
            }
        }

        return input1;

    }

}
