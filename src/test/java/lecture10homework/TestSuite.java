package lecture10homework;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class TestSuite extends BaseTest {
    @DataProvider(name = "Smoke Test Suite")
    public Object[][] createData1() {
        return new Object[][]{
                {(3000), (5)},
        };
    }

    @Test(groups = "exclude", dataProvider = "Smoke Test Suite")
    public void verifyData1(int n1, int n2) {
        long id = Thread.currentThread().getId();
        assertEquals(n1 + n2, 3005, "Incorrect calculation!");
    }

    @Test(groups = "client1", dataProvider = "Smoke Test Suite")
    public void verifySum(int number1, int number2) {
        long id = Thread.currentThread().getId();
        int sum = (number1 + number2);
        assertTrue(sum == 3005, "Wrong calculation!");
    }

    @Test(groups = "smoke test", dataProvider = "Smoke Test Suite")
    public void verifySubtraction(int number1, int number2) {
        long id = Thread.currentThread().getId();
        double result = number1 - number2;
        assertEquals(result, 2995, "Wrong calculation!");
    }

    @Test(groups = "regression", dataProvider = "Smoke Test Suite")
    public void verifyMultiplication(int number1, int number2) {
        long id = Thread.currentThread().getId();
        double multiplyResult = number1 * number2;
        assertEquals(multiplyResult, 15000, "Wrong calculation!");
    }

    @Test(groups = "client2", dataProvider = "Smoke Test Suite")
    public void verifyDevision(int number1, int number2) {
        long id = Thread.currentThread().getId();
        double devisionResult = number1 / number2;
        assertEquals(devisionResult, 600, "Wrong calculation!");
    }

    @Test(groups = "client3", dataProvider = "Smoke Test Suite")
    public void verifyModulus(int number1, int number2) {
        long id = Thread.currentThread().getId();
        double modulusResult = number1 % number2;
        assertTrue(modulusResult == 0);
    }

}
