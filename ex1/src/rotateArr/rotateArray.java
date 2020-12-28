package rotateArr;

import static org.junit.Assert.*;

import org.junit.Test;

public class rotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr = {1,2,3,4,5};
		int rotation = 6;

		System.out.println("--------before Rotate-----------");
	       
		printArr(arr);
		
		int [] afterRotate = rotateArrayLocationA(arr , rotation);
		System.out.println("--------after Rotate-----------");
       
		printArr(afterRotate);

	}

	private static void printArr(int[] arr) {
	
		for(int i = 0; i< arr.length; i++){  
            System.out.print(arr[i] + " ");  
        } 
		System.out.println();

	}

	public static int[] rotateArrayLocationA(int[] arr, int rotateLeft) {
		// TODO Auto-generated method stub
		  for(int i = 0; i < rotateLeft; i++){  
	            int j, first;  
	            //Stores the first element of the array  
	            first = arr[0];  
	            for(j = 0; j < arr.length-1; j++){  
	                //Shift element of array by one  
	                arr[j] = arr[j+1];  
	            }  
	            //First element of array will be added to the end  
	            arr[j] = first;  
	        }  
		return arr;
	}
	
	@Test
	   public static void testRotate() {	
		int [] arr = {1,2,3,4,5};
		int rotation = 6;
		int [] afterRotate = {2,3,4,5,1};
		assertArrayEquals(afterRotate,rotateArrayLocationA(arr , rotation));     
	   }

}
