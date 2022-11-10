package question15;

import java.util.*;
import java.lang.*;
import java.io.*;
public class Hashtableexample {
	 public static void main(String args[])
	    {
	        //----------hashtable -------------------------
	        Hashtable<Integer,String> ht=new Hashtable<Integer,String>();
	        ht.put(101," Phani");
	        ht.put(101,"Indra");
	        ht.put(102,"AKV");
	        System.out.println("-------------Hash table--------------");
	        for (Map.Entry m:ht.entrySet()) {
	            System.out.println(m.getKey()+" "+m.getValue());
	        }
	 
	        //----------------hashmap--------------------------------
	        HashMap<Integer,String> hm=new HashMap<Integer,String>();
	        hm.put(100,"Hi");
	        hm.put(104,"This"); 
	        hm.put(101,"is");
	        System.out.println("-----------Hash map-----------");
	        for (Map.Entry m:hm.entrySet()) {
	            System.out.println(m.getKey()+" "+m.getValue());
	        }
	    }

}
