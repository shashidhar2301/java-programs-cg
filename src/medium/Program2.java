package medium;

public class Program2 {

	public static void main(String[] args) {

		/*
		 * "2. Check the given number is Strong number or not. Strong number is a
		 * special number whose sum of factorial of digits is equal to the original
		 * number. For example: 145 is strong number. Since, 1! + 4! + 5! = 145"
		 * 
		 */
		
		boolean flag = checkStrongNumber(145);
		System.out.println(flag);
		
	}

	private static boolean checkStrongNumber(int num) {
		
		int temp = num;
		int sum =0 ;
		while(temp>0) {
			
			int fraction = calculateFractions(temp%10);
			sum+=fraction;
			temp/=10;
		}
		return sum==num;
		
	}

	private static int calculateFractions(int digit) {
		
		int sum =1;
		for(int i=1;i<=digit;i++) {
			sum*=i;
			
		}
		return sum;
		
	}
}
