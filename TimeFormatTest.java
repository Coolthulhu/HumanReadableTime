import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TimeFormatTest {

	@Test
	void SecondsToReadableTime_NegativeSeconds_Throws() {
		assertThrows(IllegalArgumentException.class, () -> TimeFormat.SecondsToReadableTime(-1));
	}
	
	@Test
	void SecondsToReadableTime_CorrectTime() {
		assertEquals("12:34:56", TimeFormat.SecondsToReadableTime(12 * 3600 + 34 * 60 + 56));
	}
	
	@Test
	void FormatTime_FormatsCorrectly() {
		assertEquals("01:02:03", TimeFormat.FormatTime(new Time(1, 2, 3)));
	}
	
	@Test
	void SecondsToHoursMinutesSeconds_SplitsCorrectly() {
		Time time = TimeFormat.SecondsToHoursMinutesSeconds(10 * 3600 + 5 * 60 + 1);
		assertEquals(10, time.hours);
		assertEquals(5, time.minutes);
		assertEquals(1, time.seconds);
	}
}
