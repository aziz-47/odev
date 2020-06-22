package day36;

import java.util.HashSet;

public class HashSet01 {

	public static void main(String[] args) {
		
		HashSet<String>hSet = new HashSet<>();
		hSet.add("A");
		hSet.add("B");
		hSet.add("C");
		System.out.println(hSet);
		
		hSet.add("C");
		System.out.println(hSet);
		
		System.out.println(hSet.contains("C"));
		
		
		
	}

}
