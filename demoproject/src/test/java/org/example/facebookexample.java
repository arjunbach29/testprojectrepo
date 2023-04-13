package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class facebookexample {
    WebDriver tester;


    @BeforeClass
    @Parameters({"Browser", "Url"})
    public void sauceTest(String browser, String link) {

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
    void applySelector() throws InterruptedException {
//        tester.findElement(By.cssSelector("input#email")).sendKeys("arjunbacharwar29@gmail.com");
//        tester.findElement(By.cssSelector("#email")).sendKeys("arjunbacharwar29@gmail.com");
//        Thread.sleep(1000);
//        tester.findElement(By.cssSelector("#pass")).sendKeys("");
//        Thread.sleep(4000);
//        tester.findElement(By.cssSelector("#login")).click();
//        tester.findElement(By.cssSelector("input[name=email]")).sendKeys("arjunbacharwar29@gmail.com");
//        tester.findElement(By.cssSelector("input.inputtext[name=email]")).sendKeys("arjunbacharwar29@gmail.com");
//        Thread.sleep(1000);
//        tester.findElement(By.cssSelector("input.inputtext[name=email]")).sendKeys("arjunbacharwar29@gmail.com");

    }
    @AfterClass
    void closeTester(){
        tester.close();
    }
}

// x path is a language/syntax for finding any element on the webpage using xml path expression
// syntax to write relative xpath 1 //tagname[@attribute='value']

