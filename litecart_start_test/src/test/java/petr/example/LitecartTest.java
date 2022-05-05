package petr.example;

import com.codeborne.selenide.Selenide;
import org.testng.annotations.Test;

@Test
public class LitecartTest {

    @Test
    public void testName() {
        Selenide.open("http://localhost/litecart");
        System.out.println("Success");
    }
}
