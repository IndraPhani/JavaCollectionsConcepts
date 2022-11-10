package question8;

public class TryCheck {

		   public static int method() {
		      try {
		         System.out.println("Try Block is executed first ");
		         return 10;
		      } finally {
		         System.out.println("Finally Block is executed second and then the return type of try bock");
		      }
		   }
		   public static void main(String[] args) {
		      System.out.println(method());
		   }
		
}
