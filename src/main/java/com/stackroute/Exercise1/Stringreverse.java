package com.stackroute.Exercise1;
import java.util.*;

public class Stringreverse {
    public static String reverse(String str) {
        String temp="";
        int length = str.length();
        for (int i = length - 1; i >= 0; i--) {
            temp = temp + str.charAt(i);
        }
        return temp;

    }


}
