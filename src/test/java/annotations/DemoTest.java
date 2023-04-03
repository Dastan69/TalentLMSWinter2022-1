package annotations;

import org.testng.Assert;
import org.testng.annotations.*;

public class DemoTest {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Before Suite");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("Before test -> Runs once");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("Runs once before class");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Runs before every method");
    }

    @BeforeGroups(groups = "group1")
    public void beforeGroups(){
        System.out.println("Before group 1");
    }

    @Test(groups = "group1")
    public void DemoTest1(){
        System.out.println("Demo Test1");
    }


    @AfterGroups(groups = "group1")
    public void afterGroups(){
        System.out.println("After group 1");
    }


    @Test(groups = "group2")
    public void DemoTest2(){
        System.out.println("Demo Test2");
        Assert.assertEquals(100, 100);
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("Runs after every method");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("Runs once after class");
    }


    @AfterTest
    public void afterTest(){
        System.out.println("After test -> Runs once");
    }


    @AfterSuite
    public void afterSuite(){
        System.out.println("After Suite");
    }



}
