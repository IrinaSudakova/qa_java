import com.example.Cat;
import com.example.Feline;
import static org.junit.Assert.*;
import org.junit.Test;
import java.util.List;

public class CatTest {

    Feline testFeline = new Feline();
    Cat testCat = new Cat(testFeline);

    @Test
    public void checkGetSound() {
        String expectedSound = "Мяу";
        assertEquals(expectedSound, testCat.getSound());
    }

    @Test
    public void checkGetFood() throws Exception {
        List<String> expectedEat = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expectedEat, testCat.getFood());
    }
}