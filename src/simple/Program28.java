package simple;

public class Program28 {

	public static void main(String[] args) {

		/*
		 * 28. Given the product of numbers, say x and Y. Find out the values are X and
		 * Y, provided X and Y should be mirror numbers.
		 * 
		 */
		
		checkMirrorNumbersOfProduct(252);
	}

	private static void checkMirrorNumbersOfProduct(int num) {
		
		
		for(int i=1;i<num/2;i++) {
			
			if(num%i == 0) {
				int temp = num/i;
				if(i>10) {
				int newNum = checkMirrorCondition(i);
				
				if(temp == newNum)
					System.out.println(newNum+":"+i);
				}
				
			}
		}
		
		
	}

	private static int checkMirrorCondition(int num) {
		
		int temp = 0;
		int newNum = 0 ;
		while(num!=0) {
			temp =  num%10;
			newNum = newNum*10 + temp;
			num/=10;
		}
		//System.out.println(temp1+"::"+newNum);
		return newNum;
		
	}
	
	

}
