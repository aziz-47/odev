package day23;

import java.util.ArrayList;
import java.util.List;

public class Tekrar01 {

	public static void main(String[] args) {
	  
		List<Integer>list1 = new ArrayList<>();
		
		list1.add(2);
		list1.add(3);
		System.out.println(list1);
		
		List<Integer>list2= new ArrayList<>();
		
		list2.add(4);
		list2.add(5);
		list2.add(6);
		
		list1.addAll(list2);//
		System.out.println(list1);
		
		list2.addAll(list1);
		System.out.println(list2);
		
		list2.addAll(list2);
		System.out.println(list2);
		
		System.out.println("====>");
		
		
		List<Integer>list3= new ArrayList<>();
		list3.add(7);
		list3.add(8);
		System.out.println(list3);
		
		List<Integer>list4= new ArrayList<>();
		list4.add(9);
		list4.add(11);
		System.out.println(list4);
		
		
		list4.addAll(0, list3);
		System.out.println(list4);
		
		list4.addAll(1, list3);
		System.out.println(list4);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
