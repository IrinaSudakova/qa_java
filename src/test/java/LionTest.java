import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.*;

public class LionTest {

    Feline testFeline = new Feline();
    Lion testLion = new Lion(testFeline);

    @Test
    public void checkExceptionInConstructor() {
        String expectedMessage = "Используйте допустимые значения пола животного - самец или самка";
        Exception exception = assertThrows(Exception.class, () -> {
            new Lion("Не самец");
        });
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void checkGetKittens() {
        int expectedKittens = 1;
        assertEquals(expectedKittens, testLion.getKittens());
    }

    @Test
    public void checkEatMeat() throws Exception {
        List<String> expectedEat = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expectedEat, testLion.getFood());
    }
}
