package com.stackroute.Exercise1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IdentifyCharecterTest {

    IdentifyCharecter check;

    @Before
    public void setup(){
        check = new IdentifyCharecter();
    }
    @After
    public void tearDown(){
        check=null;
    }
    @Test
    public void givenLowercaseInputShouldReturnSmalletter(){
        String result=check.Charecter('a');
        assertEquals("Small Letter",result);
    }
    @Test
    public void givenUppercaseInputShouldReturnSmalletter(){
        String result=check.Charecter('B');
        assertEquals("Capital Letter",result);
    }
    @Test
    public void givenDigitInputShouldReturnSmalletter(){
        String result=check.Charecter('5');
        assertEquals("Digit",result);
    }
    @Test
    public void givenspecialcharecterInputShouldReturnSmalletter(){
        String result=check.Charecter('$');
        assertEquals("SpecialCharacter",result);
    }


}