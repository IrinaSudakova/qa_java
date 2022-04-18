import com.example.Animal;
import org.junit.Test;
import static org.junit.Assert.*;

public class AnimalTest {

    @Test
    public void checkGetFamily() {
        Animal testAnimal = new Animal();
        String expectedString = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        assertEquals(expectedString, testAnimal.getFamily());
    }

    @Test
    public void checkGetFoodException() {
        String expectedMessage = "Неизвестный вид животного, используйте значение Травоядное или Хищник";
        Exception exception = assertThrows(Exception.class, () -> {
            new Animal().getFood("Не хищник");
        });
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }
}