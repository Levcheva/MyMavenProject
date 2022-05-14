import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ChildClass extends ParentClass {


    @BeforeMethod



    @AfterMethod


    @BeforeClass

    @Test
    public void testCase() {
        System.out.println("***** Executing Actual Test");
    }
}
