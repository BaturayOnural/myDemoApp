package com.mycompany.app;

import java.util.Arrays;
import java.util.ArrayList;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    public void testNotFound1() { /*SUB BY 0 CONDITIYON*/
      ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      assertFalse(new App().search(array, 0,2));
    }
    public void testFound() { /*Checks the arithmetic operations of inputs.*/
      ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      assertTrue(new App().search(array, 2,3));
    }

    public void testNotFound() {
      ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      assertFalse(new App().search(array, 5,30));
    }

    public void testEmptyArray() {
      ArrayList<Integer> array = new ArrayList<>();
      assertFalse(new App().search(array, 1,1));
    }

    public void testNull() {
      assertFalse(new App().search(null, 1,1));
    }
    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
