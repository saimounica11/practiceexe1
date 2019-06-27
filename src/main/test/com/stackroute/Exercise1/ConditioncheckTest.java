package com.stackroute.Exercise1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import java.util.Scanner;

public class ConditioncheckTest {

        Conditioncheck check;
        @Before
        public void setup(){
            check =new Conditioncheck();
        }
        @After
        public void tearDown(){
            check=null;
        }
       @Test
        public void givenOddIntegerInputBetweenRangeShouldReturnTomorJerry(){//arrange
            String result=check.tomjerry(25);//act
            assertEquals("Tom",result);//assert
       }
       @Test
    public void givenEvenIntegerInputBetweenRangeShouldReturnTomorJerry(){
            String result=check.tomjerry(28);
            assertEquals("Jerry",result);

       }

       @Test
       public void givenIntegerOutofrangeShouldReturnErrormessage(){
            String result=check.tomjerry(34);
            assertEquals("error",result);
       }
    }








