package com.stackroute.Exercise1;

public class Palindrome {
    public String pnum(int number)
    {
        int temp=number,sum=0,s=0;
        while(number!=0)
        {
            int remainder;
            remainder=number%10;
            if(remainder%2==0)//check if number is even
            {
                s=s+remainder;//sum of even numbers
            }
            sum=sum*10+remainder;
            number=number/10;
        }
        if(temp==sum)//check if the number is palindrome or not
        {

            if(s>25)//check if sum of even numbers is greater than 25
            {
                return "success";//if greater than 25
            }
            else {

                return "failure";//if less than 25
            }

        }
        else
        {
            return "Not a palindrome";//if not a palindrome
        }
    }
}

