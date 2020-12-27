package removeDuplicate;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;


public class removeDup {

	public static void main(String[] args) {


		List<String> l = new ArrayList<String>();  
        l.add("Mango");  
        l.add("Banana");  
        l.add("Mango");  
        l.add("Apple");  
        System.out.println(l.toString());  
        Set<String> s = new LinkedHashSet<String>(l);  
        System.out.println(s);  
        
        
        List<Integer> lst = new ArrayList<Integer>();
        lst.add(1);
        lst.add(1);
        lst.add(10);
        lst.add(1);
        lst.add(1);
        lst.add(10);
        lst.add(100);
        lst.add(1);
        lst.add(100);
		
        System.out.println(lst.toString());  
        Set<Integer> lstS = new LinkedHashSet<Integer>(lst);  
        System.out.println(lstS);  
	}

}
