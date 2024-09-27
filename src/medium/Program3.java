package medium;

public class Program3 {

	public static void main(String[] args) {
		/*
		 * 3. Print all Armstrong number between 1 to 1000. An Armstrong number is a
		 * n-digit number that is equal to the sum of nth power of its digits. For
		 * example, 6 = 61 = 6 371 = 33 + 73 + 13 = 371
		 * 
		 */
		
		getArmStrongNumbers(1000);
	}

	private static void getArmStrongNumbers(int num) {
		
		
		for(int i=1;i<=num;i++) {
			
			if(calculateSum(i)) {
				System.out.println(i);
			}
		}
		
	}

	private static boolean calculateSum(int num) {

		int length = String.valueOf(num).length();
		int temp = 0;
		int sum  = 0;
		int dupl = num;
		while(num>0) {
			temp = num%10;;
			num/=10;
			sum+=Math.pow(temp, length);
		}
		return sum==dupl;
	}
}
