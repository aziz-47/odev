package day10;

import java.util.Scanner;

public class Tekrar01 {

	public static void main(String[] args) {
		// // Kullanýcýdan kredi kartý numarasýný alýn ve
		//bu numaranýn üçüncü, dördüncü ve sonuncu  rakamlarýný ekrana yazdýrýn.
		
		Scanner scan= new Scanner(System.in);
		System.out.println("kredi karti numrasi aliniz");
	   String no= scan.nextLine();
	   
	   int lenght= no.length();
	   
	   System.out.println(no.charAt(2));
	   System.out.println(no.charAt(3));
	   System.out.println(no.charAt(lenght-1));
		
		
	}

}
