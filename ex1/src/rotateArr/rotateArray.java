package rotateArr;

import static org.junit.Assert.*;

import org.junit.Test;

public class rotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr = {1,2,3,4,5};
		int rotation = 6;
		rotateArrayLocation(arr , rotation);
		int [] afterRotate = rotateArrayLocationA(arr , rotation);
		System.out.println("-------------------");
       
		printArr(afterRotate);
		for(int i = 0; i< arr.length; i++){  
            System.out.print(arr[i] + " ");  
        } 
	}

	private static void printArr(int[] afterRotate) {
		// TODO Auto-generated method stub
		
	}

	public static int[] rotateArrayLocationA(int[] arr, int n) {
		// TODO Auto-generated method stub
		  for(int i = 0; i < n; i++){  
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

	private static void rotateArrayLocation(int[] arr, int n) {
		// TODO Auto-generated method stub
        System.out.println("Original array: ");  
        for (int i = 0; i < arr.length; i++) {  
            System.out.print(arr[i] + " ");  
        }  
        //Rotate the given array by n times toward left  
        for(int i = 0; i < n; i++){  
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
        System.out.println();  
        //Displays resulting array after rotation  
        System.out.println("Array after left rotation: ");  
        for(int i = 0; i< arr.length; i++){  
            System.out.print(arr[i] + " ");  
        }  
    }  
	@Test
	   public static void testRotate() {	
		int [] arr = {1,2,3,4,5};
		int rotation = 6;
		int [] afterRotate = {2,3,4,5,1};
		assertArrayEquals(afterRotate,rotateArrayLocationA(arr , rotation));     
	   }

}
