package org.example;

import junit.framework.Assert;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.jupiter.api.*;

public class AppTest 
    extends TestCase {
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
//    @BeforeAll
//    public static void beforeClass() {
//        System.out.println("Before Class");
//    }
//
//    @AfterAll
//    public static void afterClass() {
//        System.out.println("AfterClass");
//    }
//    @BeforeEach
//    public void beforeMethod(){
//        System.out.println("Before Method");
//    }
//    @AfterEach
//    public void afterMethod(){
//        System.out.println("AfterMethod");
//    }
//
//
//    @Test
//    public void test1() {
//        System.out.println("Test1");
//    }
//
//    @Test
//    public void test2() {
//        System.out.println("Test2");
//
//    }
    App a=new App();
    @DisplayName("this is addition test")
    @Test
    public  void additiontest(){
        assertEquals(5,a.addition(3,2));

    }
    @Test
    public void assertarrayequal(){
        Assertions.assertArrayEquals(new int[] {1,2,3,4},new int[] {5,6,7,8});
    }
    @Test
    public void assertTrue(){
        Assert.assertTrue(5>2);
    }
}


//    grouping is not possible in junit
//    dependency is also not possible in junit
//        parallel test runs is not possible