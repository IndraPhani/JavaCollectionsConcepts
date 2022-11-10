package question10;

import assignment03.SuperClass;

public class SubClass extends SuperClass {

	 void methodOfSuperClass() throws ArrayIndexOutOfBoundsException
	    {
	        System.out.println("can be overrided with any unchecked Exception");
	        System.out.println("If throws SQLException is used then we will get error as it is Checked exception");
	        
	    }
	
	 
	 public static void main(String[] args) {
	     SubClass s = new SubClass();
	     s.methodOfSuperClass();
	   }
}
