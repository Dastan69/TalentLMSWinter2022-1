package eShop;

import org.testng.annotations.*;

public class BaseTest {



    @BeforeSuite
    public void setUp(){
        System.out.println("chrome");
    }

    @BeforeTest
    public void openSite(){
        System.out.println("Opening a site");
    }

    @AfterTest
    public void closeSite(){
        System.out.println("Closing a site");
    }

    @AfterSuite
    public void exitingBrowser(){
        System.out.println("Leaving chrome");
    }
}
