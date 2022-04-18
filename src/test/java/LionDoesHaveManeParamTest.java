import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class LionDoesHaveManeParamTest {

    // два поля класса: для проверяемой строки и ожидаемого результата
    private final String checkedSex;
    private final boolean expectedMane;

    // конструктор с двумя параметрами
    public LionDoesHaveManeParamTest(String checkedSex, boolean expectedMane) {
        this.checkedSex = checkedSex;
        this.expectedMane = expectedMane;
    }

    //  метод для получения тестовых данных
    @Parameterized.Parameters(name = "для \"{0}\" ожидаемый результат \"{1}\"") // добавили аннотацию
    public static Object[] getTestData() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false}
        };
    }

    @Test
    public void shouldCheckLionDoesHaveMane() throws Exception {
        Lion lion = new Lion(checkedSex);
        Boolean actualMane = lion.doesHaveMane();
        assertEquals(expectedMane, actualMane);
    }
}