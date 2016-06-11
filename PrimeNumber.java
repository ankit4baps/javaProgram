package firstNextgen;

public class PrimeNumber {

	public static void main(String[] args) {
		// this program is for printing prime numbers from 1 to 10
		
		int i=0, num=0;
		
		//start a loop for checking number is prime or not
		System.out.print("Prime Numbers are:");
		for(i = 1; i <= 10; i++) {
			
			int counter = 0;
			for(num = i; num >= 1; num--) {
				if(i%num == 0) {
					counter = counter + 1;
				}
			}
			if (counter == 2) {
				System.out.print(" " + i);
			}
		}
	}

}
