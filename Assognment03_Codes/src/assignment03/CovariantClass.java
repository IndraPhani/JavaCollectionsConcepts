package assignment03;

public class CovariantClass extends SuperClass  {


	
	CovariantClass get() {
		      System.out.println("SubClass");
		      return this;
		   }
		   public static void main(String[] args) {
		      SuperClass tester = new CovariantClass();
		      tester.get();
		   }
		

}
