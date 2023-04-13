package org.example;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class javascriptalertexample {
    WebDriver tester;
    @BeforeClass
    public void setUp() {


        WebDriverManager.chromedriver().setup();
        tester = new ChromeDriver();

        tester.get("https://the-internet.herokuapp.com/javascript_alerts");
        tester.manage().window().maximize();

    }

    @Test

    public void alertmethod() throws InterruptedException {
//        tester.findElement(By.xpath("//button[text()=\"Click for JS Alert\"]")).click();
//        Thread.sleep(1000);
//        Alert alert = tester.switchTo().alert();
//        Thread.sleep(1000);
//        alert.accept();
//        Thread.sleep(1000);
//        tester.findElement(By.xpath("//button[text()=\"Click for JS Confirm\"]")).click();
//        Thread.sleep(1000);
//        Alert alert = tester.switchTo().alert();
//        Thread.sleep(1000);
//        alert.accept();
//        Thread.sleep(1000);
//        tester.findElement(By.xpath("//button[text()=\"Click for JS Prompt\"]")).click();
//        Thread.sleep(1000);
//        Alert alert = tester.switchTo().alert();
//        Thread.sleep(1000);
//        alert.sendKeys("hello");
//        Thread.sleep(1000);
//        alert.accept();
//        Thread.sleep(1000);
////        alert.dismiss();//for cancelling we can use dismiss


    }

    @AfterClass
    void closeTester(){
        tester.close();
    }


}

