import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class StudentServiceParamTest {

    @Parameterized.Parameter
    public int score;

    @Parameterized.Parameter(1)
    public String expectedResult;

    @Parameterized.Parameters
    public static Object[][] testData() {
        return new Object[][] {
                {90, "Молодец!"},
                {75, "Хорошо,но можно лучше!"},
                {37, "Средний результат."},
                {15, "Плохой результат!"},
                {-500, "Непонятный результат"}
        };
    }

    @Parameterized.Parameters
    public static Object[] testDataNew() {
        return new Object[] {
                90,
                100,
                500,
                900,
                1000,
                2000
        };
    }

    @Test
    public void checkScoreTest() {
        StudentService service = new StudentService();
        String result = service.checkStudentScore(score);
        assertEquals("ТЕСТ УПАЛ!", expectedResult, result);
    }

    @Test
    public void checkSome() {
        assertTrue(true);
    }
}