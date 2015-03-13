import java.util.ArrayList;

public class MedicalPractice {
	private String name;
	private ArrayList<Country> countries;
	private ArrayList<Region> regions;
	private ArrayList<Doctor> doctors;
	private ArrayList<Specialty> specialties;
	
	public MedicalPractice(String name){
		this.name = name;
		this.countries = new ArrayList<Country>();
		this.specialties = new ArrayList<Specialty>();
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public boolean addCountry(Country country) {
		for (Country c: this.countries){
			if (c.getName().toLowerCase().equals(country.getName().toLowerCase())){
				System.out.println("Country already exists!");
				return false;
			}
		}
		//if (findRegion(region)!= null){
		//	System.out.println("Country already exists!");
		//	return false;
		//}
		
		return this.countries.add(country);
	};
	
	public boolean removeCountry(Country country){
		for (Country c: countries){
			c.getName().toLowerCase().equals(country.getName().toLowerCase());
			return countries.remove(c);
		}
		return false;
	};
	
	public Country findClinic(Country country){
		for (Country c: countries){
			c.getName().toLowerCase().equals(country.getName().toLowerCase());
			return c;
		}
		return null;
	}
	
	public ArrayList<Country> getCountries() {
		return countries;
	}
	
	public void printBranchAll(){
		ArrayList<Region> regs;
		
		System.out.println("================== Medical Practice MPAMS Branches ==================\n");
		if (countries.size() == 0){
			System.out.println("   No branch available.\n");
		}
		else{
			for (Country c: countries){
				System.out.println("===== "+ c.getName() + " =====");
				regs = c.getRegions();
				if (regs.size() == 0)
					System.out.println("   No branch available in this Country.\n");
				else{
					for (Region r: regs){
						r.printClinic();
					}
				}
			}
		}
		System.out.println("====================== Medical Practice MPAMS  ======================");
	}
	public void printCountries(){
		for (Country c: countries){
			System.out.println(c.getName());
		}
	}
	
	public void printBranchByCountry(Country country){
		
	}
	
	public void printBranchByRegion(Region region){
		
	}
	
	public void printBranchBySpecialty(){
		
	}
}
