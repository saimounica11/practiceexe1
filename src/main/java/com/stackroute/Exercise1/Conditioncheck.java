package com.stackroute.Exercise1;
import java.util.Scanner;

public class Conditioncheck {
    public static String tomjerry(int number){

        if((number%2==0)&&(number>=20&&number<=30))//if number between 20 and 30 is even
            return "Jerry";

        else if ((number%2!=0)&&(number>=20&&number<=30))//if odd

            return "Tom";
        else
            return "error";//if number not between 20 and 20

    }

}
