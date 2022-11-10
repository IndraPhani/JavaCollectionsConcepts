package question27;

public class SingleSynch {

		   private static SingleSynch instance = null;

		   public static synchronized SingleSynch getInstance() {
			   if (instance == null) {
		           instance = new SingleSynch();
		       }

		       return instance;
		}

		public static void setInstance(SingleSynch instance) {
			SingleSynch.instance = instance;
		}

		private SingleSynch() {
			   
		   }
		   
		   public static void main(String[] args)
		    {
			   SingleSynch obj = new SingleSynch();
		  
		    }

}
