package java_Assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class A4P4 {

	public static void main(String[] args) {
		 Map<Integer, String> myMap = new HashMap<Integer, String>();
	      myMap.put(1, "Java1");
	      myMap.put(2, "Java2");
	      myMap.put(3, "Java3");
	      myMap.put(4, "Java4");

	      ArrayList<Integer> k1 = new ArrayList<Integer>(myMap.keySet());
	      

	      System.out.println("list of keys in the hashmap is ::"+k1);

	}

}
