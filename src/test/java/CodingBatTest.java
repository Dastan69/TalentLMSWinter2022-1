
import com.digital.CodingBat;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class CodingBatTest {

    SoftAssert softAssert = new SoftAssert();
    CodingBat test = new CodingBat();

    @Test
    public void scoresIncreasingTest(){
        int [] result = {1, 3, 4};
        Assert.assertEquals(test.scoresIncreasing(result), true);
    }

    @Test
    public void scores100Test(){
        int [] result = {1, 100, 99, 100};
        Assert.assertEquals(test.scores100(result), false);
    }

    @Test
    public void scoresClumpTest(){
        int [] result = {3, 4, 5};
        Assert.assertEquals(test.scoresClump(result), true);
    }

    @Test
    public void wordsCountTest(){
        String[] result = {"cat", "dog", "long", "me"};
        Assert.assertEquals(test.wordsCount(result, 3), 2);
    }

    @Test
    public void wordsFront(){
        String[] result = {"java", "fun", "hello", "world"};
        String[] expected = {"java", "fun", "hello"};
        Assert.assertEquals(test.wordsFront(result, 3), expected);
    }

    @Test
    public void wordsWithoutListTest(){
        String[] given = {"a", "bb", "b", "ccc"};
        List<String> expected = new ArrayList<>();
        expected.add("bb");
        expected.add("ccc");
        Assert.assertEquals(test.wordsWithoutList(given, 1), expected);
    }

    @Test
    public void hasOneTest(){
        Assert.assertEquals(test.hasOne(10), true);
    }

    @Test
    public void dividesSelfTest(){
        Assert.assertEquals(test.dividesSelf(120), false);
    }

    @Test
    public void copyEvensTest(){
        int[] given = {3, 2, 4, 5, 8};
        int[] expected = {2,4};
        Assert.assertEquals(test.copyEvens(given, 2), expected);
    }

    @Test
    public void matchUpTest(){
        String[] str1 = {"aaa", "bb", "xxx"};
        String[] str2 = {"xwr", "bh", "lj"};
        Assert.assertEquals(test.matchUp(str1, str2), 1);
    }

    @Test
    public void scoreUpTest(){
        String[] key = {"a", "a", "b", "b"};
        String[] answers = {"a", "c", "b", "c"};
        Assert.assertEquals(test.scoreUp(key, answers), 6);
    }

    @Test
    public void wordsWithoutTest(){
        String[] given = {"a", "b", "c", "a"};
        String[] expected = {"b", "c"};
        Assert.assertEquals(test.wordsWithout(given, "a"), expected);
    }

    @Test
    public void scoresSpecial(){
        int[] a = {12, 10, 4};
        int[] b = {2, 20, 30};
        Assert.assertEquals(test.scoresSpecial(a, b), 40);
    }




}
