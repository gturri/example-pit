package fr.turri;

import static org.junit.Assert.fail;
import static org.junit.Assert.assertEquals;

public class PrimeCheckerTest {
	@org.junit.Test
	public void shouldThrowIfLowerThanTwo(){
		shouldThrowIfLowerThanTwo(-1);
		shouldThrowIfLowerThanTwo(0);
		shouldThrowIfLowerThanTwo(1);
	}
	
	private void shouldThrowIfLowerThanTwo(int n) {
		try {
			PrimeChecker.isPrime(n);
		} catch(Exception e){
			return;
		}
		fail("Should have thrown for " + n);
	}
	
	@org.junit.Test
	public void shouldDetectPrime() throws Exception{
		shouldDetectPrime(2, true);
		shouldDetectPrime(3, true);
		shouldDetectPrime(4, false);
		shouldDetectPrime(5, true);
		shouldDetectPrime(27, false);
		shouldDetectPrime(31, true);
		shouldDetectPrime(121, false);
	}
	
	private void shouldDetectPrime(int n, boolean isPrime) throws Exception{
		assertEquals("Expected is prime: " + isPrime + " for n=" + n, isPrime, PrimeChecker.isPrime(n));
	}

}
