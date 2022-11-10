package question19;

public class UsingRunnable implements Runnable {
	public void run() {
		System.out.println("Thread started running..");
	}

	public static void main(String args[]) {
		UsingRunnable mt = new UsingRunnable();
		Thread t = new Thread(mt);
		t.start();
	}


}
