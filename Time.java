/**
 * Class containing time represented as hours (must be 0-99), minutes (0-59) and seconds (0-59).
 */
public class Time {
	public final int hours;
	public final int minutes;
	public final int seconds;
	public Time(int hours, int minutes, int seconds) {
		if(hours < 0 || hours > 99) {
			throw new IllegalArgumentException("Hours must be between 0 and 99 inclusive.");
		}
		if(minutes < 0 || minutes > 59) {
			throw new IllegalArgumentException("Minutes must be between 0 and 59 inclusive.");
		}
		if(seconds < 0 || seconds > 59) {
			throw new IllegalArgumentException("Seconds must be between 0 and 59 inclusive.");
		}
		
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
	}
}
