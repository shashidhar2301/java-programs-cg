package simple;

public class Pragram11 {

	/*
	 * "11. Check the given number A. is power of 2. Ex: Input : 100 ouput: False
	 * (not power of 2) Input: 4 Ouput: True (2 power 2 is 4)"
	 * 
	 */
	public static void main(String[] args) {
		int num =18;
		System.out.println(checkPower(num));
	}

	private static boolean checkPower(int num) {
		
		while(num>0 && num%2==0) {
			num/=2;
			System.out.println(num);
			
		}
		if(num==1)
			return true;
		return false;
		
	}
	
}
