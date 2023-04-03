package annotations;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DemoTest2 {

    public int sum(int a, int b){
        return a +b;
    }

    @Test(dataProvider = "numbers")
    public void testSum(int a, int b, int result){
        Assert.assertEquals(sum(a, b), result);
    }

    @DataProvider
    public static Object[][] numbers(){
        return new Object[][]{
                {10, 20, 30},
                {0, 10, 10},
                {-10, 20, 10}};
    }

    @Test(enabled = false)
    public void test2(){
        System.out.println("Propusk test");
    }

    @Test(dependsOnMethods = "testSum")
    public void test3(){
        System.out.println("Depends on method testSum");
    }

    @Test(timeOut = 10)
    public void test4(){
        System.out.println("Time limit is 10 sec");
    }
}
