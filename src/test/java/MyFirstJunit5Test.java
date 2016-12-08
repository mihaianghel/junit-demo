import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


public class MyFirstJunit5Test {

    private FirstClass aClass = new FirstClass();

    @Test
    void shouldPass(TestInfo testInfo) {
        assertEquals("s", aClass.print("s"));
    }

    @Test
    void shouldFail() {
        assertNotEquals("a", aClass.print("s"));
    }
}
