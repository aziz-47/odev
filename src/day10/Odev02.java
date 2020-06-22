package day10;

import java.util.Scanner;

public class Odev02 {

	public static void main(String[] args) {
		// Kullanýcýdan kredi kartý numarasýný alýn ve
		//bu numaranýn üçüncü, dördüncü ve sonuncu  rakamlarýný ekrana yazdýrýn.
		
		Scanner scan= new Scanner (System.in);
		System.out.println("Kredi karti numarasini aliniz");
		 String no= scan.nextLine();
		 
		 int lenght= no.length();
		 System.out.println(no.charAt(3));
		 System.out.println(no.charAt(4));
		 System.out.println(no.charAt(lenght-1));
		 
	
		 scan.close();
		 
	
	}

}
