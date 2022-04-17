import com.example.Feline;
import org.junit.Test;

import java.util.List;
import static org.junit.Assert.*;

public class FelineTest {


    Feline testFeline = new Feline();

    @Test
    public void checkGetFamily() {
        String expectedFamily = "Кошачьи";
        assertEquals(expectedFamily, testFeline.getFamily());
    }

    @Test
    public void checkGetKittensReturnMethod() {
        int expectedKittens = 1;
        assertEquals(expectedKittens, testFeline.getKittens());
    }

    @Test
    public void checkGetKittensReturnInt() {
        int testKittens = 1;
        int expectedKittens = 1;
        assertEquals(expectedKittens, testFeline.getKittens(testKittens));
    }

    @Test
    public void checkEatMeat() throws Exception {
        List<String> expectedEat = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expectedEat, testFeline.eatMeat());
    }
}
