package day13;

import java.util.Scanner;

public class Odev04 {

	public static void main(String[] args) {
		// Kullan�c�dan uzunlu�u �ift say� olan bir String al�n 
		//ve bu String�in ilk yar�s�n� ekrana yazd�r�n. Ornegin;
		//Kullan�c� �Hollanda� girerse ekrana �Holl� yazd�racaks�n�z.
		
		Scanner scan= new Scanner (System.in);
		System.out.println("Bir string giriniz");
		String str= scan.nextLine();
		
		if(str.length()%2==0) {
			System.out.println(str.substring(0, (str.length()/2)));
		}else {
			System.out.println("Yalnis deger girdiniz");
		}
		scan.close();
		


	}

}
