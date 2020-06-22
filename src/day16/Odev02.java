package day16;

import java.util.Scanner;

public class Odev02 {

	public static void main(String[] args) {
		// // Kullanıcıdan isim ve soyismini alın.
		//Kullanıcının isim ve soyisminin ilk harﬂerini büyük 
		//diğer harﬂerini küçük harf olarak ekrana yazdıran programı yazınız
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Isim giriniz");
		String isim= scan.nextLine().toLowerCase();
		System.out.println("sosyisim girniniz");
		String soyIsim= scan.nextLine().toLowerCase();
		
		isimYazma(isim, soyIsim);
		

	}
	public static void isimYazma(String isim, String soyIsim) {
	isim=	isim.substring(0, 1).toUpperCase() + isim.substring(1);
	soyIsim=	soyIsim.substring(0, 1).toUpperCase() + soyIsim.substring(1);
		
		System.out.println(isim + " " + soyIsim);
	}
	

}
