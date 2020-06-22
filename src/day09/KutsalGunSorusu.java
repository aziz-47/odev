package day09;

import java.util.Scanner;

public class KutsalGunSorusu {

	public static void main(String[] args) {
//		Kullanýcýdan bir gun alýn eðer gun “Cuma” ise ekrana “Müslümanlar için kutsal gün” yazdýrýn.
//		“Cumartesi” ise ekrana “Yahudiler için kutsal gün” yazdýrýn. “Pazar” ise ekrana
//		“Hýristiyanlar için kutsal gün” yazdýrýn. Diler günler icin “Kutsal gün deðil” yazdýrýn.
		
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Bir gun  giriniz");
		
		String gun=scan.next().toLowerCase();
		
		
		
		switch(gun) {
		case "Cuma":
			System.out.println("Muslumanlar icin kutsal gun");
			break;
		case "Cumartesi":
			System.out.println("Yahudiler  icin kutsal gun");
			break;
		case "Pazar":
			System.out.println("Hristiyanlar icin kutsal gun");
			break;
			default:
				System.out.println("kutsal gun degil");
			
		}
		scan.close();
		
	}

}
