import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGDemo {

    @Test
    public void createNewUserTest(){
        User firstUser = new User("John", 30);
        Assert.assertNotNull(firstUser);
    }

    @Test(dependsOnMethods = "createNewUserTest")
    public void loginTest(){
        Assert.assertTrue(true);
    }

    @DataProvider(name = "inputValues")
    public static Object[][] getInputValues(){
        return new Object[][]{
                {"aigerim@gmail.com", "ValidPass"},
                {"aigerim@gmail.co", "InvalidPass"},
                {"aigerim@gmail.com", "ValidPass"}};
    }

    @Test(dataProvider = "inputValues")
    public void testLoginFun(String userName, String password){
        System.out.println(userName + " " + password);
    }
}
