package day15;

import java.util.Scanner;

public class Odev05 {

	public static void main(String[] args) {
		// Kullan�c�ya bir String girmesini s�yleyin 
		//ve bu String�i yukar�dan a�a��ya do�ru yazd�ran  Program yaz�n�z.
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
