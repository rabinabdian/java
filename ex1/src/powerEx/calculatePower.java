package powerEx;

import java.util.Scanner;

public class calculatePower {

	public static void main(String[] args) {
		// compute value of x raised to power of y 
		
	    System.out.println("compute value of x raised to power of y");
	    System.out.println ("Enter Number X : ");
	    Scanner sc = new Scanner(System.in);
	    int num = sc.nextInt();
		
	    System.out.println ("Enter Power Y : ");
	    int pow = sc.nextInt();


	    calculatePow(num,pow);
	    
	    sc.close();
	    
	}

	private static void calculatePow(int num, int pow) {
		// TODO Auto-generated method stub
		int temp = num;

		for (int i = 0; i < pow; i++) {
			temp =temp*1/num;
		}
		System.out.println(" value of "+num+ "raised to power of "+pow+" is " +1/temp);
	}
	


}
