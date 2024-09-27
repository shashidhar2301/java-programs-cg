package simple;

public class Program19 {

	public static void main(String[] args) {

		/*
		 * "19. Find out the second smallest element in a given array with appropriate
		 * logic that takes minimal time and space complexity. Array =
		 * {-1,-10,20,42,-13,0,100}
		 * 
		 * Output : -10"
		 * 
		 */
		 
		secondSmallest(new int[]{-1,-10,20,42,-13,0,100});
		secondSmallest(new int[]{1,10,20,42,13,2,100});
	}

	private static void secondSmallest(int[] arr) {
		
		int firstSmallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;
		for(int i : arr) {
			if(i < firstSmallest) {
				secondSmallest = firstSmallest;
				firstSmallest = i;
				
			}
			else if(i<secondSmallest && i!=firstSmallest)
				secondSmallest = i;
		}
	 
		System.out.println(firstSmallest);
		System.out.println(secondSmallest);
		
		/*
		for(int i : arr) {
			
			if(firstSmallest<i && i<secondSmallest)
				secondSmallest = i;
		}
		
		System.out.println(secondSmallest);
		*/
		
		
	}

}
