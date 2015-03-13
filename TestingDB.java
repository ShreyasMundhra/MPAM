import java.util.*;
import java.lang.String;

public class TestingDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		char ch;
		int n;
		String name, address, region;
		ArrayList<Specialty> specialties = new ArrayList<Specialty>();
		ArrayList<Doctor> doctors = new ArrayList<Doctor>();
		//Adding country
		/*System.out.println("Enter name of country: ");
		String countryName = input.next();
		Country c = new Country(countryName);*/
		/*
		do {
			System.out.println("Do you want to add branch to this country? Y or N");
			ch = input.next().charAt(0);
		} while(Character.toLowerCase(ch) != 'n');
		System.out.println("Please enter the number of clinic you want to add to this country:");
		n = input.nextInt();
		for (int i=0; i < n; i++){
			System.out.println("Enter Clinic region: ");
			region = input.next();
			System.out.println("Enter Clinic name: ");
			name = input.next();
			System.out.println("Enter Clinic address: ");
			address = input.next();
			System.out.println("Choose Clinic Specialties: ");
			
			System.out.println("Choose Clinic Doctors: ");
		}*/
		//Hardcoded
		
		//Create Medical Practice
		MedicalPractice mp = new MedicalPractice("Private Medical Practice Healthier");
		mp.printBranchAll();
		mp.printCountries();
		
		//Create Country
		//IMPT: every Country created must be added to Medical Practice
		Country malay = new Country("Malaysia");
		mp.addCountry(malay);
		Country thai = new Country("Thailand");
		mp.addCountry(thai);
		Country sing = new Country("Singapore");
		mp.addCountry(sing);
		mp.printBranchAll();
		
		//Create Region
		//IMPT: every region created must be added to Country
		Region boonlay = new Region("Boonlay");
		sing.addRegion(boonlay);
		mp.printBranchAll();
		
		//Create Specialty
		Specialty ENT = new Specialty("ENT");
		Specialty dental = new Specialty("Dental Service");
		Specialty womenHealth = new Specialty("Women Health Services");
		
		//Create Clinic
		Clinic abc = new Clinic("ABC", "Healthy Street 101", boonlay );
		
		//Create Patient
		//Create Doctor
		//Create DoctorSchedule
		//Create Treatment
		
		//Print List of Medical Practice Branch (all 3 countries)
		//Print List of Medical Practice by Country
		//Print List of Medical Practice by Region
		//Print List of Medical Practice by Specialty
		//Print List of Appointment
		//Print Account Details
		//Print List of Patient Details
		//Print List of Doctor Details
		
	}

}
