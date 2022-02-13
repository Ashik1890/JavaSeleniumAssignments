package java_Assignments;

import java.util.TreeSet;

public class A4P6 {

	public static void main(String[] args) {
		   TreeSet<Integer> treeSet = new TreeSet<Integer>();
		      treeSet.add(233);
		      treeSet.add(459834);
		      treeSet.add(65);
		      treeSet.add(700);
		      treeSet.add(560);
		      treeSet.add(50);
		      treeSet.add(4000);
		 
		      System.out.println("TreeSet Lowest value = " + treeSet.first());
		      System.out.println("TreeSet Highest value = " + treeSet.last());

	}

}
