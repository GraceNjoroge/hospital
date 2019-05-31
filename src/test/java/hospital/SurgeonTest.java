package hospital;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SurgeonTest {

	Surgeon underTest = new Surgeon("3", "name", "area", true);
	Patient patient = new Patient();

	// test on state verification (variables)
	@Test
	public void shouldBeAbleToDrawBlood() {

		int bloodLevelBefore = patient.getBloodLevel();
		underTest.drawBlood(patient);
		int bloodLevelAfter = patient.getBloodLevel();
		assertThat(bloodLevelBefore - bloodLevelAfter, is(5));
	}

	// test increase of patient health
	@Test
	public void shouldBeAbleToIncreasePatientHealth() {
		int healthLevelBefore = patient.getHealthLevel();
		underTest.administerCare(patient);
		int healthLevelAfter = patient.getHealthLevel();
		assertThat(healthLevelBefore - healthLevelAfter, is(-5));

	}

	public void shouldReturnEmpNumber() {
		String check = underTest.getEmpNumber();
		assertEquals(check, "3");

	}

	@Test
	public void shouldReturnEmpName() {
		String check = underTest.getEmpName();
		assertEquals(check, "name");
	}

	@Test
	public void shouldReturnIfOperating() {
		boolean check = underTest.isOperating();
		assertTrue(check);
	}

	@Test
	public void shouldGetPaid120000() {
		String check = underTest.paySalary();
		assertEquals(check, "120000");
	}
}