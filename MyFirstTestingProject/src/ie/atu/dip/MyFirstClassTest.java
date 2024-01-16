package ie.atu.dip;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

class MyFirstClassTest {

	@Test
	void test() {
		
		String strExpectedResult = "JUnit is working.";
		String strActualResult = "JUnit is working.";
		
		assertEquals(strExpectedResult, strActualResult);
	}
	
	@Test
	void AnotherTest() {
		
		String strExpectedResult = "JUnit is working.";
		String strActualResult = "JUnit is working.";
		
		assertEquals(strExpectedResult, strActualResult);
		
		
	}

}
