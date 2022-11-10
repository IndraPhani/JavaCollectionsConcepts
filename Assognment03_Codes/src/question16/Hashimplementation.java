package question16;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hashimplementation {


	    public static void main(String args[]) {
	        Map<String, Long> contact = new HashMap<String, Long>(100, 0.9f);

	        contact.put("Phani", 903262990L);
	        contact.put("Indra", 9035529980L);

	        Set<Map.Entry<String, Long>> contactset = contact.entrySet();
	        System.out.println("---------: Contacts in my Phone List :----------");
	        for (Map.Entry<String, Long> phoneEntry : contactset) {
	            System.out.println("Name : " + phoneEntry.getKey() + " " + " Number : " + phoneEntry.getValue());
	        }
	        System.out.println("------------------------------------------------");
	        System.out.println("Total no. of contacts : " + contact.size());
	        System.out.println("Phani's Contact number : " + contact.get("Phani"));
	        System.out.println("Removing contact : " + contact.remove("Indra"));
	    }
	}
	
	
	

