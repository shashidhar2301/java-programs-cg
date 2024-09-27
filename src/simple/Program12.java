package simple;

public class Program12 {
	public static void main(String[] args) {

		/*
		 * "12. Check the given number is power of 5. Ex: Input : 25 ouput: Truw
		 * (because 5 power 2 is 25) Input: 80 Ouput: false (not power of 5)"
		 * 
		 */
		
		int num = 125;
		System.out.println(checkPower(num));
	}

	private static boolean checkPower(int num) {
		
		int count = 0;
		
		while(num>0 && num%5==0) {
			num/=5;
			count++;
		}
		if(num == 1) {
			System.out.println(count);
			return true;
		}
		return false;
		
	}
}
