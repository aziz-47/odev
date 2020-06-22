package day11;

public class Tekrar01 {

	public static void main(String[] args) {
		//
		
		
		String str = "Cat, caterpillar"; 
		
		System.out.println(str.substring(3));
		System.out.println(str.substring(15));
		System.out.println(str.substring(16));
		System.out.println(str.substring(3,4)); 
		System.out.println(str.endsWith( " "));
		System.out.println(str.replace('t', 'm')); 
		System.out.println(str.replace("", "|")); 
		System.out.println(str.replace("a", "")); 
		System.out.println(str.replaceFirst("c", "C")); 

	}

}