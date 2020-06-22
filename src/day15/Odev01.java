package day15;

import java.util.Scanner;

public class Odev01 {

	public static void main(String[] args) {
		// Kullanıcıdan isim ve soyismini alın. Kullanıcının isim ve soyisminin ilk harﬂerini büyük
		//diğer harﬂerini küçük harf olarak ekrana yazdıran programı yazınız.
		
		Scanner scan= new Scanner (System.in);
		System.out.println("Lutfen isminizi griniz");
		String isim= scan.nextLine();
		
		System.out.println("Lutfen soyisminizi giriniz");
		String soyIsim= scan.nextLine();
		
		tamIsim( isim, soyIsim);
		
		scan.close();
		
	}
	
	public static void tamIsim(String isim, String soyIsim) {
		
		System.out.println(isim.toUpperCase().charAt(0)+ isim.substring(1).toLowerCase() + " " +
				soyIsim.toUpperCase().charAt(0) + soyIsim.substring(1).toLowerCase());
	
		
	}
	

}
