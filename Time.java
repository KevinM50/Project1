import java.util.Objects;
/**
 * Time --- a program that focuses on a military time and runs through tests
 * @author Kevin Mendez
 */
public class Time {
	private int hours; 
	private int minutes; 
	private int seconds;
	/**
	 *  The constructor that enables the client to input initial values for all hours, minutes, and seconds
	 * @param hours represents the hours
	 * @param minutes represents the minutes
	 * @param seconds represents the seconds
	 */
    Time(int hours, int minutes, int seconds) {
		super();
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
	}
    /**
     * Time is set to 09:00:00 as default
     */
	public Time() {
		super();
		hours = 9;
		minutes = 00;
		seconds = 00;
	}
	/**
	 * Getter method for the hours field
	 * @return returns the exact hour
	 */
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	/**
	 * Getter method for minutes field
	 * @return returns the exact minute
	 */
	public int getMinutes() {
		return minutes;
	}
	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}
	/**
	 * Getter method for the seconds field
	 * @return returns the exact second
	 */
	public int getSeconds() {
		return seconds;
	}
	public void setSeconds(int seconds) {
		this.seconds = seconds;
		
	}
	@Override
	/**
	 * toString format is hrs:mins:secs
	 */
	//Method that returns the string in the form of hrs:mins:secs
	public String toString() {
		return String.format("%02d:%02d:%02d", hours, minutes, seconds);
	}
	/**
	 * Method that increments the seconds by 1 and resets to 0 after hitting 60 and increments minutes by 1
	 * seconds++ - a counter for seconds that resets to 0 after hitting 60
	 */
	public void incrementSeconds() {
		seconds++;
		if (seconds == 60) {
			seconds = 0;
			incrementMinutes();
		}	
	}
	/**
	 * Method that increments the minutes by 1 and resets to 0 after hitting 60 and increments hours by 1
	 * minutes++ - a counter for minutes that resets to 0 after hitting 60
	 */
	
	public void incrementMinutes() {
		minutes++;
		if (minutes == 60) {
			minutes = 0;
			incrementHours();
		}
	}
	/**
	 * Method that increments the hours by 1 and resets to 0 after hitting 24
	 * hours++ - a counter for hours that resets to 0 after hitting 24
	 */
	
	public void incrementHours() {
		hours++;
		if (hours == 24) {
			hours = 0;		
		}
	}
	@Override
	public int hashCode() {
		return Objects.hash(hours, minutes, seconds);
	}
	/**
	 * equals method ensures that the Object method knows about hours, minutes, and seconds and the tests can go through
	 */
	@Override
	public boolean equals(Object obj) {
	    if (this == obj)
	        return true;
	    if (obj == null)
	        return false;
	    if (getClass() != obj.getClass())
	        return false;
	    Time other = (Time) obj;
	    if (hours != other.hours)
	        return false;
	    if (minutes != other.minutes)
	        return false;
	    if (seconds != other.seconds)
	        return false;
	    return true;
	}
}
