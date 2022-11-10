package question18;

public class Twicethread extends Thread {
	 
		 public void run(){  
		   System.out.println("running...");  
		 }  
		 public static void main(String args[]){  
			 Twicethread t1=new Twicethread();  
		  t1.start();  
		  t1.start();  
		 }  
		// There will be error after running the programs so thread cannot be started twice,

}
