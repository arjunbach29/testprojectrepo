package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class checkboxexample {
    WebDriver tester;

    @BeforeClass
    public void setUp() {


        WebDriverManager.chromedriver().setup();
        tester = new ChromeDriver();

        tester.get("https://demoqa.com/automation-practice-form");
        tester.manage().window().maximize();

    }

    @Test
    public void checkboxmethod() throws InterruptedException {
//        tester.findElement(By.xpath("//label[normalize-space()='Sports']")).click();
//        Thread.sleep(4000);
//        JavascriptExecutor jsE = (JavascriptExecutor) tester;
//        jsE.executeScript("window.scrollBy(0,360)","");
//
//        WebElement e = tester.findElement(By.xpath("//label[contains(text(),'Sports')]"));
//        e.click();
//        Thread.sleep(2000);

    }

    @AfterClass
    void closeTester(){
        tester.close();
    }

}

