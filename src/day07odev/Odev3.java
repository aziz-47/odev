package day07odev;

import java.util.Scanner;

public class Odev3 {

	public static void main(String[] args) {
		// Kullanýcýdan bir gun alýn eðer gun “Cuma” ise ekrana “Müslümanlar icin kutsal gün” yazdýrýn.
        //“Cumartesi” ise ekrana “Yahudiler icin kutsal gün” yazdýrýn. 
        //“Pazar” ise ekrana “Hýristiyanlar icin kutsal gün” yazdýrýn.
        // Diger gunler icin ekrana "Kutsal gun degil" yazdirin.
		
		
		Scanner scan= new Scanner (System.in);
		System.out.println("lutfen bir gun giriniz");
		
		String day= scan.nextLine();
		
		if(day.equalsIgnoreCase("Cuma") ) {
			System.out.println("muslumanlar icin kutsal gun");
		}else if(day.equalsIgnoreCase("cumartesi")) {
			System.out.println("yahudiler icin kutsal gun");
		}else if(day.equalsIgnoreCase("pazar")) {
			System.out.println("hritisyanlar icin kutsakl gun");
		}else {
			System.out.println("kutsal gun dgeildir");
		}
		
		scan.close();
		
	

        

	}

}
