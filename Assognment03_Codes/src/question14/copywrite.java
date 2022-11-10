package question14;


import java.io.*;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
public class copywrite {
	
	public static void main (String[] args)
    {
        // creating a thread-safe Arraylist.
        CopyOnWriteArrayList<String> threadSafeList
            = new CopyOnWriteArrayList<String>();
 
        // Adding elements to synchronized ArrayList
        threadSafeList.add("Phani");
        threadSafeList.add("Indra");
        threadSafeList.add("Practise");
 
        System.out.println("Elements of synchronized ArrayList :");
 
        // Iterating on the synchronized ArrayList using iterator.
        Iterator<String> it = threadSafeList.iterator();
 
        while (it.hasNext())
            System.out.println(it.next());
    }

}
