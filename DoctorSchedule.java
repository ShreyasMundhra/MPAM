import java.util.Calendar;
import java.util.HashMap;

public class DoctorSchedule {
	private Clinic clinic;
	private Calendar day;
	private int startTime;
	private int endTime;
	
	public Clinic getClinic() {
		return clinic;
	}
	public void setClinic(Clinic clinic) {
		this.clinic = clinic;
	}
	public Calendar getDay() {
		return day;
	}
	public void setDay(Calendar day) {
		this.day = day;
	}
	public int getStartTime() {
		return startTime;
	}
	public void setStartTime(int startTime) {
		this.startTime = startTime;
	}
	public int getEndTime() {
		return endTime;
	}
	public void setEndTime(int endTime) {
		this.endTime = endTime;
	}
}
