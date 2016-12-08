import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class TargetTest {

	private Target target = new Target();

	@Test
	@DisplayName("Custom test name :)")
	public void displayNameTest() {
		assertEquals("s", target.print("s"));

	}

	// Multiple assertions - ALL are executed, final report of the failed ones
	@Test
	public void multipleAssertionsTest() {
		assertAll("Person",
			  () -> assertEquals("John", target.print("s")),
			  () -> assertEquals("s", target.print("s"))
		);
	}

	@Test
	void exceptionTesting() {
		Throwable exception = assertThrows(IllegalArgumentException.class,
			  () -> target.throwExceptionWithMessage("message"));
		assertEquals("message", exception.getMessage());
	}
}
