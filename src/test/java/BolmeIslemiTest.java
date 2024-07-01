import org.example.BolmeIslemi;
import org.example.SifiraBol;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class BolmeIslemiTest {
    public class HatayıBulTest {
        @Test
        public void testDivideByZero() {
            BolmeIslemi bolmeIslemi = new BolmeIslemi();

            try {
                bolmeIslemi.bol(10, 0);
                fail("Expected DivideByZeroException to be thrown");
            } catch (SifiraBol e) {
                String expectedMessage = "Sıfıra bölme işlemi hatası";
                String actualMessage = e.getMessage();
                assertTrue(actualMessage.contains(expectedMessage));
            }
        }
    }















}
