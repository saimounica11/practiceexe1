package com.stackroute.Exercise1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VowelConsonantTest {

    VowelConsonant vc;
    @Before
    public void setup(){
        vc=new VowelConsonant();
    }
    @After
    public void tearDown(){
        vc=null;

    }
    @Test
    public void givenStringShouldReturnVowelOrConsonant() {//arrange

        String result = vc.Check("ate");//act

        assertEquals("VowelConsonantVowel", result);//assert
    }
    @Test
    public void givenVowelShouldReturnVowel(){

        String result = vc.Check("a");

        assertEquals("Vowel", result);
    }
    @Test
    public void givenConsonantShouldReturnConsonant(){
        String result=vc.Check("b");
        assertEquals("Consonant",result);

    }






}