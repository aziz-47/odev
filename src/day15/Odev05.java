package day15;

import java.util.Scanner;

public class Odev05 {

	public static void main(String[] args) {
		// Kullanýcýya bir String girmesini söyleyin 
		//ve bu String’i yukarýdan aþaðýya doðru yazdýran  Program yazýnýz.
		//Ornegin; CAN ==> C 
		//		           A
		//		           N
		
		
		Scanner scan= new  Scanner (System.in);
		System.out.println("Bir kelime veya cumle giriniz");
		String str= scan.nextLine();
		 int lenght= str.length();
				
		
			
		yazici(str , lenght);
		scan.close();
		

	}
	
	public static void yazici (String str,  int lenght) {
		
		int harf= 0;
		
		do {
			System.out.println(str.charAt(harf));
			harf++;
		}while(harf<lenght);
		
		
		
	}

}
