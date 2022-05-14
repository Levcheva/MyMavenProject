import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static org.testng.Assert.assertEquals;

public class AssertionsTests {
    int a;
    int b;

    @Parameters({"a", "b"})
    @Test()
    public void  sampleAssertionTest(int a, int b) {
        int sum = a + b;
        System.out.println("The sum of both parameters is: " + sum);

//        assertEquals();

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(a != b);
        softAssert.assertTrue(a < b);
        softAssert.assertTrue(a > b);

        softAssert.assertAll();


    }

}
