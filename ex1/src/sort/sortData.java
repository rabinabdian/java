package sort;

import java.util.Arrays;

public class sortData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr = {23,45,32,12,3,15};
		
		 bubbleSort(arr, arr.length);
         
	        System.out.println("Sorted array : ");
	        System.out.println(Arrays.toString(arr));
		
	}
	public static void bubbleSort(int arr[], int n)
	    {
	        // Base case
	        if (n == 1)
	            return;
	      
	        // One pass of bubble sort. After
	        // this pass, the largest element
	        // is moved (or bubbled) to end.
	        for (int i=0; i<n-1; i++)
	            if (arr[i] > arr[i+1])
	            {
	                // swap arr[i], arr[i+1]
	                int temp = arr[i];
	                arr[i] = arr[i+1];
	                arr[i+1] = temp;
	            }
	      
	        // Largest element is fixed,
	        // recur for remaining array
	        bubbleSort(arr, n-1);
	    }

}