import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class Clinic {
	private String name;
	private String address;
	private Region region;
	private HashMap<Date, Date> openTiming;
	private ArrayList<Specialty> specialties;
	private ArrayList<Doctor> doctors;
	
	public Clinic(String name, String address, Region region){
		this.name = name;
		this.address = address;
		this.region = region;
		HashMap<Date, Date> opentiming = new HashMap<Date, Date>();
		ArrayList<Specialty> specialties = new ArrayList<Specialty>();
		ArrayList<Doctor> doctors = new ArrayList<Doctor>();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Region getRegion() {
		return region;
	}
	public void setRegion(Region region) {
		this.region = region;
	}
	public ArrayList<Specialty> getSpecialties() {
		return specialties;
	}
	public ArrayList<Doctor> getDoctors() {
		return doctors;
	}
	
}
