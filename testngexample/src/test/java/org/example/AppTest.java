package org.example;
import java.util.*;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
//    /**
//     * Create the test case
//     *
//     * @param testName name of the test case
//     */
//    public AppTest( String testName )
//    {
//        super( testName );
//    }
//
//    /**
//     * @return the suite of tests being tested
//     */
//    public static Test suite()
//    {
//        return new TestSuite( AppTest.class );
//    }
//
//    /**
//     * Rigourous Test :-)
//     */
//    public void testApp()
//    {
//        assertTrue( true );
//    }
    @Test(priority = 1,enabled = false)
    public void openbrowser(){
        System.out.println("opening browser");
    }
    @Test(priority = 2)
    public void clickums(){
        System.out.println("ums is clicked");
    }
    @Test(priority = 3)
    public void openhomepage(){
        System.out.println("opening homepage");
    }
    @Test(priority = 4)
    public void closeums(){
        System.out.println("closing ums");
    }
    @Test(priority = 5)
    public void closebrowser(){
        System.out.println("closing browser");
    }
}
