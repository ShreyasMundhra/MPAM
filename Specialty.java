import java.lang.String;
import java.util.ArrayList;

public class Specialty {
	private String name;
	private ArrayList<String> services;
	
	public Specialty(String name){
		this.name = name;
		ArrayList<String> services = new ArrayList<String>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<String> getServices() {
		return services;
	}

	public void addService(String service) {
		services.add(service);
	}
	
	public boolean removeService(String service){
		return services.remove(service);
	}
	
}
