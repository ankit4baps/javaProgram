package firstNextgen;

public class Factorial {

	public static void main(String[] args) {
		// program for find factorial of a given number
		// e.g 5! = 5*4*3*2*1 
		// fact = 5! = 5*4*3*2*1 = 120
		// 1. fact = fact*1 = 1
		// 2. fact = fact*2 = 2
		// 3. fact = fact*3 = 6
		// 4. fact = fact*4 = 24
		// 5. fact = fact*5 = 120
		
		int num = 5;
		int fact = 1;
		
		for (int i=1; i<=num; i++ ) {
			fact = fact * i;
		}
		System.out.println("Factorial of " + num + " is: " + fact);
	}

}
