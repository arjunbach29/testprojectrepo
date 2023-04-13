package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class frameexample {
    WebDriver tester;

    @BeforeClass
    public void setUp() {


        WebDriverManager.chromedriver().setup();
        tester = new ChromeDriver();

        tester.get("https://the-internet.herokuapp.com/iframe");
        tester.manage().window().maximize();

    }

    @Test
    public void framemethod() throws InterruptedException {
        tester.switchTo().frame("mce_0_ifr");
        WebElement e = tester.findElement(By.id("tinymce"));
        e.clear();
        e.sendKeys("My name is arjun bacharwar");
        Thread.sleep(10000);

    }

    @AfterClass
    void closeTester(){
        tester.close();
    }

}
