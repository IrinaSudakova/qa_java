import com.example.LionAlex;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.*;

public class LionAlexTest {

    LionAlex testLionAlex = new LionAlex();

    public LionAlexTest() throws Exception {
    }

    @Test
    public void checkGetKittensReturnMethod() {
        int expectedKittens = 0;
        assertEquals(expectedKittens, testLionAlex.getKittens());
    }

    @Test
    public void checkGetKittensReturnInt() {
        int testKittens = 0;
        int expectedKittens = 0;
        assertEquals(expectedKittens, testLionAlex.getKittens(testKittens));
    }

    @Test
    public void checkGetPlaceOfLiving() {
        String placeOfLiving = "Нью-Йоркский зоопарк";
        assertEquals(placeOfLiving, testLionAlex.getPlaceOfLiving());
    }

    @Test
    public void checkGetFriends() {
        List<String> friends = List.of(new String[]{"Марти", "Глория", "Мелман"});
        assertEquals(friends, testLionAlex.getFriends());
    }

    @Test
    public void checkConstructor() {
        Boolean actualMane = testLionAlex.doesHaveMane();
        assertTrue(actualMane);
    }
}
