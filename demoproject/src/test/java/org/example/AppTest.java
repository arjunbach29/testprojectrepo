package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.List;

public class AppTest
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

        WebDriver tester;


        @BeforeClass
        @Parameters({"Browser", "Url"})
        public void sauceTest (String browser, String link){

            if (browser.equalsIgnoreCase("chrome")) {
                WebDriverManager.chromedriver().setup();
                tester = new ChromeDriver();
            } else if (browser.equalsIgnoreCase("edge")) {
                WebDriverManager.edgedriver().setup();
                tester = new EdgeDriver();
            }
            tester.get(link);
            tester.manage().window().maximize();

        }


        @Test
        void accessWebsite () throws InterruptedException {
            tester.findElement(By.id("user-name")).sendKeys("standard_user");
            Thread.sleep(1000);
            tester.findElement(By.name("password")).sendKeys("secret_sauce");
            Thread.sleep(1000);

            tester.findElement(By.name("login-button")).click();
            Thread.sleep(2000);


  //          Assert.assertEquals(tester.getTitle(), "Swag Labs");
//            tester.findElement(By.linkText("Sauce Labs Bike Light")).click();
   //         tester.findElement(By.partialLinkText("Sauce")).click();
   //         Thread.sleep(1000);
  //          String a =tester.findElement(By.className("inventory_details_price")).getText();
//            String a tester.findElement(By.tagName())

//            System.out.println(a);
//            List<WebElement> list = tester.findElements(By.partialLinkText("Labs"));
////            list.get(0).click();
//            list.get(1).click();
//                     Thread.sleep(1000);
//                  List<WebElement> li =   tester.findElements(By.tagName("a"));
////            System.out.println(li.size());
//            tester.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div/div/form/div[1]/input")).sendKeys("standard_user");
//            Thread.sleep(4000);
//            tester.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/input[1]")).sendKeys("secret_sauce");
//            Thread.sleep(4000);
//            tester.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/input[1]")).click();
//            Thread.sleep(4000);
//            tester.findElement(By.xpath("//input[@id='user-name' or @name='user-name2']")).sendKeys("standard_user");
//            Thread.sleep(4000);
//            tester.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
//            Thread.sleep(4000);
//            tester.findElement(By.xpath("//input[@id='login-button']")).click();
//            Thread.sleep(4000);
//            contains -                                     attributes,value
//            tester.findElement(By.xpath("//input[contains(@id,'name')]")).sendKeys("standard_user");
//            starts-with -                                    attributes,value
//            tester.findElement(By.xpath("//input[starts-with(@id,'name')]")).sendKeys("standard_user");
//            by using text
//            tester.findElement(By.xpath("//div[text()=\"Sauce Labs Bike Light\"]")).click();
//            Thread.sleep(4000);

//            tester.findElement(By.xpath(""))




        }

//        @Test
//        void testAddCart () throws InterruptedException {
//            tester.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
//            Thread.sleep(3000);
//            tester.findElement(By.id("shopping_cart_container")).click();
//            Thread.sleep(3000);
//
//        }

        @AfterClass
        void closeTester () {
            tester.close();
        }


}
