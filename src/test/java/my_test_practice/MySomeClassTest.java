package my_test_practice;

import com.digital.my_practice.MySomeClass;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class MySomeClassTest {

    MySomeClass obj = new MySomeClass();

    @Test
    public void testMethod2(){

        int result = obj.sumNumbers(2, 5);
        System.out.println("Running Test -> testMethod2");
        Assert.assertEquals(obj.sumNumbers(2,5), 7);
        Assert.assertEquals(result, 7);
    }
    @Test
    public void testMethod3(){

        System.out.println("Running Test -> testMethod3");
    }

    @Test
    public void testMethod1(){

        System.out.println("Running Test -> testMethod1");
    }

   @Test
    public void testStrings(){
        System.out.println("Running Test -> testStrings");
        String expectedString = "Hello World";
        String result = obj.addStrings("Hello", "World");
        Assert.assertEquals(result, expectedString);

    }

    @Test
    public void testArrays(){
        System.out.println("Running Test -> testArrays");
        int[] expectedArray = {1, 2, 3};
        int[] result = obj.getArray();
        Assert.assertEquals(result, expectedArray);
        System.out.println("End of:" + "Running Test -> testArrays");
    }

    // TestNG_SoftAsserts

    @Test

    public void testSum(){
        SoftAssert sa = new SoftAssert();
        System.out.println("\nRunning Test -> testSum");
        int result = obj.sumNumbers(4,4);
        Assert.assertEquals(result, 8);
        System.out.println("\nLine after assert 1");
        sa.assertEquals(result, 6);
        System.out.println("\nLine after assert 2");
        sa.assertAll();
    }

}
