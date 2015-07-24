package fr.turri;

public class PrimeChecker {
	public static boolean isPrime(int n) throws Exception{
		if ( n <= 1 ){
			throw new Exception("n should be greater than 1");
		}
		
		if ( n == 2 ){
			return true;
		}
		
		if ( n%2 == 0 ){
			return false;
		}
		
		int upperBound = (int) Math.sqrt(n) + 1;
		for ( int i=3 ; i < upperBound ; i += 2){
			if ( n%i == 0){
				return false;
			}
		}
		
		return true;
	}

}
