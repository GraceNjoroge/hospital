package hospital;

import static org.junit.Assert.assertEquals;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class DoctorTest {

	Doctor underTest = new Doctor("1", "name", "area");
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
		assertThat(healthLevelBefore - healthLevelAfter, is(-5));

	}
	@Test 
	public void shouldReturnEmpNumber()  {
		String check = underTest.getEmpNumber();
		assertEquals(check, "1");
		
	}
	@Test 
	public void shouldReturnEmpName()  {
		String check = underTest.getEmpName();
		assertEquals(check, "name");
}
	@Test 
	public void shouldReturnSpeciality() {
		String check = underTest.getSpeciality();
		assertEquals(check, "area"); 
		
	}
	@Test 
	public void shouldGetPaid90000() {
		String check = underTest.paySalary();
		assertEquals(check, "90000");
}}
