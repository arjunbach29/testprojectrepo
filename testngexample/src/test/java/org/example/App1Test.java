package org.example;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.*;

public class App1Test {
    @Test(priority = 1)
    public void openbrowser(){
        System.out.println("opening browser");
    }
    @Test(priority = 2,skipFailedInvocations = true)
    public void opengoogle(){
        System.out.println("opening google");
//        Assert.assertEquals(true,false);


    }
    @Test(priority = 3,enabled = false)
    public void closegoogle(){
        System.out.println("closing google");
    }
    @Test(priority = 4,enabled = false)
    public void closebrowser(){
        System.out.println("closing browaer");
    }
}
