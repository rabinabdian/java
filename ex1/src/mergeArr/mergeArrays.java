package mergeArr;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ArrayBlockingQueue;

import org.junit.jupiter.api.Test;

public class mergeArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] arr1 = new Integer[] { 1, 3, 5, 7, 9 };
		Integer[] arr2 = new Integer[] { 0, 2, 4, 6, 8 };

		 // calling mergeSets() 
        System.out.println("Merged Set: " + mergeArraysSet(arr1, arr2)); 
        
        
		Integer[] arr3 = new Integer[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		  Set<Integer> c = new HashSet<Integer>(); 
	        c.addAll(Arrays.asList(arr3));
	        System.out.println("c Set: " + c); 
	}

	private static <T> Set<T> mergeArraysSet(Integer[] arr1, Integer[] arr2) {
		 // Creating the sets to be merged 
        // First set 
        Set<Integer> a = new HashSet<Integer>(); 
        a.addAll(Arrays.asList(arr1)); 
  
        // Second set 
        Set<Integer> b = new HashSet<Integer>(); 
        b.addAll(Arrays.asList(arr2)); 
  
        // Creating an empty set 
        Set<T> mergedSet = new HashSet<T>(); 
  
        // add the two sets to be merged 
        // into the new set 
        mergedSet.addAll((Collection<? extends T>) a); 
        mergedSet.addAll((Collection<? extends T>) b); 
  
        // returning the merged set 
        return mergedSet; 
	}

	@Test
	   public static void testMergeArraysSet() {	
		Integer[] arr1 = new Integer[] { 1, 3, 5, 7, 9 };
		Integer[] arr2 = new Integer[] { 0, 2, 4, 6, 8 };
		Integer[] arr3 = new Integer[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		  Set<Integer> c = new HashSet<Integer>(); 
	        c.addAll(Arrays.asList(arr3));
	        System.out.println("c Set: " + c); 
		assertEquals(c,mergeArraysSet(arr1, arr2));     
	   }
}
