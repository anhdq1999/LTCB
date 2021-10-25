package exercise.lab4_5.records;
/*
 * tạo class TimeSound
 * 
 */
public class TimeSound {
	private int minute;
	private int seconds;

	public TimeSound(int minute, int seconds) {
		super();
		this.minute = minute;
		this.seconds = seconds;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getSeconds() {
		return seconds;
	}

	public void setSeconds(int seconds) {
		this.seconds = seconds;
	}

	
}
