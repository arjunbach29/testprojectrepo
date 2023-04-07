package org.example;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.*;

//import junit.framework.Test;
//import junit.framework.TestCase;
//import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest
//    extends TestCase
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
    @Test
    public void testcase1_login(){
    App a = new App();
    Assert.assertEquals(true,a.login_test("user","user123"));

}

    @Test
    public void testcase2_login(){
        App a = new App();
        Assert.assertEquals(false,a.login_test("user1","user"));
    }

}
