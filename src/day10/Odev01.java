package day10;

public class Odev01 {

	public static void main(String[] args) {
		//
		
		String str = "Cat, caterpillar";
		
		System.out.println(str.indexOf("cat"));  
		
		System.out.println(str.indexOf("ter")); 
		
		System.out.println(str.indexOf("pars")); 
		
		System.out.println(str.indexOf("a" , 3 )); 
		
		System.out.println(str.indexOf("at", 2)); 
		
		System.out.println(str.indexOf("at", 8)); 
		
		System.out.println(str.lastIndexOf("at")); 
		
		System.out.println(str.lastIndexOf("s")); 
		
		System.out.println(str.lastIndexOf("CAT"));
		
		System.out.println(str.lastIndexOf("a" , 3 ));
		
		System.out.println(str.lastIndexOf("a" , 5 )); 
		
		System.out.println(str.toUpperCase()); 
		
		System.out.println(str.toLowerCase());  
		
		System.out.println(str.substring(4).toLowerCase()); 
		
		System.out.println(str.substring(3,8).toUpperCase()); 
		
		String strA = "Cat   " ;
		
		System.out.println(strA.trim()); 
		
		String strB = "Cat";
		
		System.out.println(strA.contains("a")); 
		
		String strC = "  Cat";
				
	    System.out.println(strC.contains( "  ")); 

	}

}
