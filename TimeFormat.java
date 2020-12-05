/**
 * Utility class containing methods for converting time for display.
 */
public final class TimeFormat {
	/**
	 * Converts time in seconds to hours, minutes and seconds.
	 * @param secondsSum time to convert, in seconds. Must be non-negative and <360000.
	 * @return string representing time, in format HH:MM:SS.
	 */
	public static String SecondsToReadableTime(int secondsSum) {
		if(secondsSum < 0 || secondsSum >= 360000) {
			throw new IllegalArgumentException("Number of seconds must be non-negative and below 360000.");
		}
		
		return FormatTime(SecondsToHoursMinutesSeconds(secondsSum));
	}
	
	/**
	 * Formats a {@link Time} structure into a string, in format HH:MM:SS. 
	 * @param time the time to format.
	 * @return String in format HH:MM:SS.
	 */
	public static String FormatTime(Time time) {
		return String.format("%02d:%02d:%02d", time.hours, time.minutes, time.seconds);
	}
	
	/**
	 * Converts seconds into a {@link Time} structure, containing hours, minutes and seconds.
	 * @param secondsSum time to convert, in seconds. Must be non-negative and <360000.
	 * @return Time object containing hours (0-99), minutes (0-59) and seconds (0-59).
	 */
	public static Time SecondsToHoursMinutesSeconds(int secondsSum) {
		if(secondsSum < 0 || secondsSum >= 360000) {
			throw new IllegalArgumentException("Number of seconds must be non-negative and below 360000.");
		}

		int hours = secondsSum / 3600;
		int remainderAfterHours = secondsSum - hours * 3600;
		int minutes = remainderAfterHours / 60;
		int seconds = remainderAfterHours - minutes * 60;
		return new Time(hours, minutes, seconds);
	}
}
