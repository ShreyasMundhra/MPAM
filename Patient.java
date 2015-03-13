import java.lang.String;
import java.util.ArrayList;

public class Patient {
	private String patientId;
	private ArrayList<String> allergy;
	private int age;
	private ArrayList<Appointment> listOfAppointments;
	private ArrayList<Treatment> listOfTreatments;
	private Notifier notifier;
}
