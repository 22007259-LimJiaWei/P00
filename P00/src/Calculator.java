
/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 * 
 * limji, May 25, 2023 9:29:28 AM
 * 
 */
public class Calculator {
	public int add (int a, int b) {
		return a + b;
	}
	
	public int subtract(int a, int b) {
		return a - b;
	}
	
	public int multiple(int a, int b) {
		return a * b;
	}
	
	public int divide(int a, int b) {
		
		if(b == 0) {
			throw new IllegalArgumentException();
		}
		return a / b;
	}
}
