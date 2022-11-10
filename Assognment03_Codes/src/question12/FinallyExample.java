package question12;

public class FinallyExample {
	
	public static void main(String args[]){   
	      try {    
	        System.out.println("Inside try block");  
	       int data=100/0;    
	       System.out.println(data);    
	      }   
	      catch (ArithmeticException e){  
	        System.out.println("Exception handled");  
	        System.out.println(e);  
	      }   
	      finally {  
	        System.out.println("finally block is executed always ");  
	      }    
	      System.out.println("rest of the code...");    
	      } 
	
	protected void finalize()     
    {     
        System.out.println("Called the finalize() method");     
    } 

}
