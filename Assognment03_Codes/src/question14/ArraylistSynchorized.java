package question14;

import java.util.ArrayList;
import java.util.Vector;
import java.io.*;
import java.util.*;

public class ArraylistSynchorized {
	

    public static void main (String[] args)
    {
        List<String> list =
           Collections.synchronizedList(new ArrayList<String>());
 
        list.add("Phani");
        list.add("Indra");
        list.add("AKV");
 
        synchronized(list)
        {
            // must be in synchronized block
            Iterator it = list.iterator();
 
            while (it.hasNext())
                System.out.println(it.next());
        }
    }

}
