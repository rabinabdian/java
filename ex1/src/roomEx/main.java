package roomEx;

import org.junit.Test;
import static org.junit.Assert.*;


public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Room office = new Room(17, 0, 10);
		
		

		
	//    System.out.println(office);  // => "17-0.10"

	    
	}
	@Test
	   public static void testPrintOffice(Room office) {	
	      System.out.println("Inside testPrintMessage()");    
	      assertEquals("17-0.10",  office);     
	   }
	@Test
	   public static void testPrintMessage(Room office) {	
	      System.out.println("Inside testPrintMessage()");    
	      assertEquals("17-0.10",  office.toString());     
	   }

}
