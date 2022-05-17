package timer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class TimerTest {

	int seconds;

	@ParameterizedTest(name = "{index} => seconds={0}, expected={1}")
	@CsvSource({
		"0,'00:00:00'",
		"60,'00:01:00'",
		"3600,'01:00:00'"
	})
	void test(int seconds, String expected) {
		Timer timer = new Timer(seconds);
		
		assertEquals(expected, timer.toString());
	}

	@BeforeEach
	void setUp() {
		seconds = 0;
	}

	@AfterEach
	void tearDown() {
	}

	@Test
	@DisplayName ("Empty test")
	void testToString() {

		Timer timer = new Timer(seconds);

		assertEquals("00:00:00", timer.toString());

	}
}
