package question13;

import java.util.ArrayList;
import java.util.Vector;
import java.io.*;
import java.util.*;

public class ArraylistandVector {

	public static void main (String[] args)
    {
        // creating an ArrayList
        ArrayList<String> al = new ArrayList<String>();
 
        // adding object to arraylist
        al.add("Phani");
        al.add("Indra");
 
        // traversing elements using Iterator'
        System.out.println("ArrayList elements are:");
        Iterator it = al.iterator();
        while (it.hasNext())
            System.out.println(it.next());
 
        // creating Vector
        Vector<String> v = new Vector<String>();
        v.addElement("Practice");
        v.addElement("quiz");
        v.addElement("code");
 
        System.out.println("\nVector elements are:");
        Enumeration e = v.elements();
        while (e.hasMoreElements())
            System.out.println(e.nextElement());
    }
	
	
}
