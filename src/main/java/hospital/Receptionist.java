package hospital;

public class Receptionist extends Employee {

	private boolean isAnswering;

	public Receptionist(String empNumber, String empName, boolean isAnswering) {
		this.empName = empName;
		this.empNumber = empNumber;
	    this.isAnswering = isAnswering;
	}

	@Override
	public String paySalary() {
		// TODO Auto-generated method stub
		return "45000";
	}

	public boolean isOnPhone() {
		// TODO Auto-generated method stub
		return isAnswering;
	}

}
