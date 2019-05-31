package hospital;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class JanitorTest {

	

	Janitor underTest = new Janitor("5", "name", true);

	
	public void shouldReturnEmpNumber()  {
		String check = underTest.getEmpNumber();
		assertEquals(check, "5");
		
	}
	@Test 
	public void shouldReturnEmpName()  {
		String check = underTest.getEmpName();
		assertEquals(check, "name");
}
	@Test 
	public void shouldGetPaid40000() {
		String check = underTest.paySalary();
		assertEquals(check, "40000");
}
	@Test 
	public void shouldBeSweeping() {
		boolean check = underTest.isSweeping();
		assertTrue(check);
	}
}

