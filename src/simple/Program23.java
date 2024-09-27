package simple;

public class Program23 {

	public static void main(String[] args) {
		/*
		 * "23. You have 2 curency notes {100,500}. We need to make Rs 1200 out of these
		 * notes. How many minimum notes required to get rs 1200."
		 * 
		 */
		
		System.out.println(minimunNotes(new int[] {100,500}, 50));
	}

	private static int minimunNotes(int[] notes, int target) {
		
		int count = 0;
		for(int i=notes.length-1;i>=0;i--) {
			
			count+= target/notes[i];
			target%=notes[i];
			
		}
		return count;
		
	}
	
	
	

}
