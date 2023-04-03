package eShop;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Function2 extends BaseTest{

    @BeforeMethod
    public void aaa(){
        System.out.println("Go to directory");
    }

    @Test
    public void test21(){

        System.out.println("Checking a price of product");
    }

    @Test
    public void test22(){

        System.out.println("Checking a name of product");
    }
}
