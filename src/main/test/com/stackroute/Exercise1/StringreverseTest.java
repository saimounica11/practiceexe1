package com.stackroute.Exercise1;

import static org.junit.Assert.*;

import org.junit.*;

public class StringreverseTest {
    Stringreverse sr;


    @Before
    public void setUp() {
        sr= new Stringreverse ();
        System.out.println("Before");
    }

    @After
    public void tearDown() {
        System.out.println("After");
        sr = null;
    }
    @Test
    public void givenOnestringShouldReturnReverseofstring(){
        String result=sr.reverse("london");
        assertEquals("nodnol",result);
    }
    @Test
    public void givenNullShouldReturnErrormessage(){
        String result=sr.reverse(null);
        assertEquals("Null not allowed",result);
    }
    @Test
    public void givenSinglecharecterShouldReturnSinglecharecter(){
        String result=sr.reverse("L");
        assertEquals("L",result);
    }

}