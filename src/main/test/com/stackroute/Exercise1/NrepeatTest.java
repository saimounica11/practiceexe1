package com.stackroute.Exercise1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NrepeatTest {
    Nrepeat nr;

    @Before
    public void setUp() {
        nr= new Nrepeat();

    }

    @After
    public void tearDown() {
        nr = null;
    }
    @Test
    public void givenTwoinputsShouldReturnRepeatedstringbasedonSecondInput(){
        String result=nr.subString("string",2);
        assertEquals("stringngng",result);
    }
    @Test
    public void givenInput1lessthanSecondInput2shouldReturnInput1(){
        String result=nr.subString("Sai",4);
        assertEquals("Sai",result);
    }
    @Test
    public void givenTwoinputsReturnRepeatedString(){
        String result=nr.subString("Stackroute",5);
        assertEquals("Stackrouterouterouterouterouteroute",result);

    }


}