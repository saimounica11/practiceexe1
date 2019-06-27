package com.stackroute.Exercise1;

public class GuessNumber {


        public static String guess(int original_num,int guess_num) {


            if (guess_num == original_num) {
                return "Number guessed matches the original";
            } else if (guess_num > original_num) {
                return "Number guessed is greater than the original";

            } else if (guess_num < original_num) {
                return ("Number guessed less than the original");

            }

            return null;
        } // function guess





    } // end calss


