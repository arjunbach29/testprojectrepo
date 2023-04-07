package org.example;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.*;
@Test
public class googlesearchtest {

    public void googletest() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver =new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.findElement(By.name("q")).sendKeys("Mobiles");
        Thread.sleep(100);
        driver.findElement(By.name("btnK")).click();
        Thread.sleep(100);

        Assert.assertEquals(driver.getTitle(),"Mobiles - Google Search");
        driver.close();


    }
}
//apart from parameter there is another way by using data provider
//data provider are used for data driven testing which mean same test can be run with different set of data it in very powerful feature of testng and effectively used during framework testing
//alocaated method return an array of object