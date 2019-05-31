package hospital;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ReceptionistTest {

	Receptionist underTest = new Receptionist("4", "name", true);

	
	public void shouldReturnEmpNumber()  {
		String check = underTest.getEmpNumber();
		assertEquals(check, "4");
		
	}
	@Test 
	public void shouldReturnEmpName()  {
		String check = underTest.getEmpName();
		assertEquals(check, "name");
}
	@Test 
	public void shouldGetPaid45000() {
		String check = underTest.paySalary();
		assertEquals(check, "45000");
}
	@Test 
	public void shouldBeOnThePhone() {
		boolean check = underTest.isOnPhone();
		assertTrue(check);
	}
}
