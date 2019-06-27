package com.stackroute.Exercise1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortDigitTest {
    SortDigit sn;

    @Before
    public void set(){
        sn=new SortDigit();
    }
    @After
    public void tear(){
        sn=null;
    }
    @Test
    public void givenNumbershouldReturnFalseMessage(){
        String result=sn.sortTheNumber(2345);
        assertEquals("False",result);
    }

    @Test
    public void givenNumbershouldReturnTrueMessage(){
        String result=sn.sortTheNumber(88888);
        assertEquals("True",result);
    }
    @Test
    public void givenZeroshouldReturnMessage(){
        String result=sn.sortTheNumber(0);
        assertEquals("False",result);
    }

    @Test
    public void givenNeagitiveValueshouldReturnMessage(){
        String result=sn.sortTheNumber(-2345);
        assertEquals("False",result);
    }

}