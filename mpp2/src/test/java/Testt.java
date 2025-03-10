
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import org.example.Main;

public class Testt {

    @Test
    void testProcessLines_RemovesDuplicatesAndSorts() {
        List<String> input = List.of("banana", "apple", "apple", "cherry", "banana", "date");
        List<String> expected = List.of("apple", "banana", "cherry", "date");

        List<String> result = Main.processLines(input);

        assertEquals(expected, result);
    }

    @Test
    void testProcessLines_EmptyList() {
        List<String> input = List.of();
        List<String> expected = List.of();

        List<String> result = Main.processLines(input);

        assertEquals(expected, result);
    }
}
