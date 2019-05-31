package hospital;

import static org.hamcrest.Matchers.contains;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Collection;

import org.junit.Test;

public class HospitalTest {

 Hospital hospital = new Hospital ();
	
	@Test 
	public void shouldBeAbleToAddEmployee () {
		Doctor doctor = new Doctor ("", "", "");
		hospital.addEmployee(doctor);
		Collection<Employee>check = hospital.getAllEmployees();
		
		assertThat(check, contains(doctor));
	}
	@Test 
	public void shouldBeAbleTwoDifferentEmployees () {
		Doctor doctor = new Doctor ("1", "", "");
		Nurse nurse = new Nurse ("2", "", 0);
		hospital.addEmployee(doctor);
		hospital.addEmployee(nurse);
		Collection<Employee>check = hospital.getAllEmployees();
		
		assertThat(check, contains(doctor, nurse));
		//assertThat(check, containsInAnyOrder(doctor, nurse));
		
		//Do more e.g. Fire employees and test for removals.
}}

