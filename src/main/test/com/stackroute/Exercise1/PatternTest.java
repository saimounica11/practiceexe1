package com.stackroute.Exercise1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PatternTest {
    Pattern p;

    @Before
    public void setup(){
        p=new Pattern();
    }
    @After
    public void tearDown(){
        p=null;
    }
    @Test
    public void givenNumberShouldReturnPattern(){
        String result=p.printPattern(5);
        assertEquals("1 2 2 3 3 3 4 4 4 4 5 5 5 5 5",result.trim());

    }

    @Test
    public void givenZeroShouldReturn(){
        String result=p.printPattern(0);
        assertEquals("",result);
    }




}