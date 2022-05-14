import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PriorityTests {

    @Parameters({"parameter-name", "parameter-name2"})
    @Test()
    public void sampleParameterTest(String name, String name2) {
        System.out.println("Hello, " + name + "and Hello");
    }
}
