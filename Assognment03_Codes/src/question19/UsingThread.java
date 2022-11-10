package question19;

public class UsingThread extends Thread {

	
		 public void run()
		 {
		  System.out.println("Thread started running..");
		 }
		 public static void main( String args[] )
		 {
			 UsingThread mt = new  UsingThread();
		  	mt.start();
		 }
	
}
