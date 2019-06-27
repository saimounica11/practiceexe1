package com.stackroute.Exercise1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {
    Palindrome p;
    @Before
    public void setup(){
        p=new Palindrome();
    }
    @After
    public void tearDown(){
        p=null;
    }
    @Test
    public void givenPalindromenumberAndSumOfDigitsLessThantwentyfiveShouldReturnSuccessMessage(){//arrange
        String result=p.pnum(454);//act
        assertEquals("failure",result);//assert
    }
    @Test
    public void givenPalindromenumberAndSumOfDigitsGreaterThantwentyfiveShouldReturnSuccessMessage(){
        String result=p.pnum(2988892);
        assertEquals("success",result);

    }
    @Test
    public void givenNumberisnotPalindromeShouldReturnMessage(){
        String result=p.pnum(1532);
        assertEquals("Not a palindrome",result);
    }
}