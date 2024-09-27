package simple;

public class Program10 {

	public static void main(String[] args) {
		/*
		 * "10. How to find is power of 10 Ex: Input : 100 ouput: True (because 10 power
		 * 2 is 100) Input: 80 Ouput: false (not power of 10)"
		 * 
		 */
		int num = 900;
		System.out.println(checkPower(num));
	}

	private static boolean checkPower(int num) {
		
		while(num>0 && num%10==0) {
			num/=10;
			if(num == 1)
				return true;
		}
		
		return false;
	}

	 

}
