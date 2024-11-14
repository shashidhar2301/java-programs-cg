package java8Programs.sort;



import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class CommonInTwoArrays {
    public static void main(String[] args) {
        int[] array1 = {4, 1, 3, 5, 9};
        int[] array2 = {2, 1, 3, 8, 5};

        Set<Integer> commonElements = findCommonElements(array1, array2);
        //System.out.println("Common elements: " + commonElements);
        
        findCommonElement(array1, array2);
      //  System.out.println("Common elements: " + commonElements);
    }

    public static Set<Integer> findCommonElements(int[] arr1, int[] arr2) {
        Set<Integer> set1 = Arrays.stream(arr1).boxed().collect(Collectors.toSet());
        
        return Arrays.stream(arr2)
                     .filter(set1::contains)
                     .boxed()
                     .collect(Collectors.toSet());
    }
    
    public static Set<Integer> findCommonElement(int[] arr1, int[] arr2) {
        Set<Integer> set1 = Arrays.stream(arr1).boxed().collect(Collectors.toSet());
        
        for(int i : arr2) {
        	if(set1.contains(i)) {
        		System.out.println(i);
        	}
        }
        
        return Arrays.stream(arr2)
                     .filter(set1::contains)
                     .boxed()
                     .collect(Collectors.toSet());
    }
}
