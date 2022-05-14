package lecture10homework;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    @BeforeClass
    public void beforeClass() {
        System.out.println("BaseClass' Before Class method");
    }

    @BeforeMethod
    public void beforeMethod() {
        long id = Thread.currentThread().getId();
        System.out.println("BaseClass' Before Test method. Thread id is: " + id);
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("BaseClass' After Test method");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("BaseClass' After Class method");
    }
}
