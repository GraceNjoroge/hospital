package hospital;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NurseTest {

	Nurse underTest = new Nurse("2", "name", 3);
	Patient patient = new Patient();

//test on state verification (variables)
	@Test
	public void shouldBeAbleToDrawBlood() {

		int bloodLevelBefore = patient.getBloodLevel();
		underTest.drawBlood(patient);
		int bloodLevelAfter = patient.getBloodLevel();
		assertThat(bloodLevelBefore - bloodLevelAfter, is(5));
	}

//test increase of patient health
	@Test
	public void shouldBeAbleToIncreasePatientHealth() {
		int healthLevelBefore = patient.getHealthLevel();
		underTest.administerCare(patient);
		int healthLevelAfter = patient.getHealthLevel();
		assertThat(healthLevelBefore - healthLevelAfter, is(-7));

	}
	@Test 
	public void shouldReturnEmpNumber()  {
		String check = underTest.getEmpNumber();
		assertEquals(check, "2");
		
	}
	@Test 
	public void shouldReturnEmpName()  {
		String check = underTest.getEmpName();
		assertEquals(check, "name");
}
	@Test 
	public void shouldReturnNumPatients() {
		int check = underTest.getNumPatients();
		assertEquals(check, 3); 
		
	}
	@Test 
	public void shouldGetPaid50000() {
		String check = underTest.paySalary();
		assertEquals(check, "50000");
	}
}


