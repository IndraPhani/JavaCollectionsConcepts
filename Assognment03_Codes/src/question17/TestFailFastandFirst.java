package question17;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.lang.*;
import java.io.*;
public class TestFailFastandFirst {
	
	public static void main(String args[])
    {
	ArrayList<Integer> obj = new ArrayList<>();
	obj.add(1);
	obj.add(2);
	obj.add(3);
	Iterator<Integer> itr = obj.iterator();
	while (itr.hasNext()) {
	    Integer a = itr.next();
	    obj.remove(a);
	}
	
	List<Integer> integers = new CopyOnWriteArrayList<>();
	integers.add(1);
	integers.add(2);
	integers.add(3);
	Iterator<Integer> itr1 = integers.iterator();
	while (itr1.hasNext()) {
	    Integer a = itr1.next();
	    integers.remove(a);
	}

}
}
