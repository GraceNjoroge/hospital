package hospital;

public class Surgeon extends Doctor {

	private boolean isOperating;
	public Surgeon(String empNumber, String empName, String speciality, boolean isOperating) {
		super(empNumber, empName, speciality);
		this.isOperating = isOperating;
	}
	@Override
	public String paySalary() {
	
		return "120000";
	}
	public boolean isOperating() {
	
		return isOperating;
	}
}
