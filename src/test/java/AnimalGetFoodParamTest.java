import com.example.Animal;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.List;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AnimalGetFoodParamTest {

    // два поля класса: для проверяемой строки и ожидаемого результата
    private final String checkedAnimalKind;
    private final List<String> expectedFood;

    // конструктор с двумя параметрами
    public AnimalGetFoodParamTest(String checkedAnimalKind, List<String> expectedFood) {
        this.checkedAnimalKind = checkedAnimalKind;
        this.expectedFood = expectedFood;
    }

    //  метод для получения тестовых данных
    @Parameterized.Parameters(name = "для \"{0}\" ожидаемый результат \"{1}\"")  // добавили аннотацию
    public static Object[] getTestData() {
        return new Object[][]{
                {"Травоядное", List.of("Трава", "Различные растения")},
                {"Хищник", List.of("Животные", "Птицы", "Рыба")}
        };
    }

    @Test
    public void checkGetFood() throws Exception {
        Animal testAnimal = new Animal();
        List<String> actualFood = testAnimal.getFood(checkedAnimalKind);
        assertEquals(expectedFood, actualFood);
    }
}
