package hospital;

public class HospitalApp {

	public static void main(String[] args) {
	Hospital hospital = new Hospital();
	
	Doctor jill = new Doctor ("1", "Jill", "Brain");
	Surgeon Phoebe = new Surgeon ("2", "Phoebe", "Brain", true);
	Nurse Harry = new Nurse ("3", "Harry", 5);
	Receptionist Jimmy = new Receptionist ("4", "Jimmy", true);
	Janitor Sam = new Janitor ("5", "Sam", true);
	
	hospital.addEmployee(jill);
	hospital.addEmployee(Phoebe);
	hospital.addEmployee(Harry);
	hospital.addEmployee(Jimmy);
	hospital.addEmployee(Sam);
	
	System.out.println("Here are the salary rates at the hospital:");
	hospital.showPayRates();
	
	System.out.println("Here are the employees who can give medical care:");
	hospital.showAllMedicalPersonnel();
}}
