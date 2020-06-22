package gungunodev;

import java.util.Scanner;

public class IfElseIfOdev11 {

	public static void main(String[] args) {
		//)Kullanýcýdan bir gun alýn eðer gun “Cuma” ise ekrana “Müslümanlar icin kutsal gün” yazdýrýn.
		//“Cumartesi” ise ekrana “Yahudiler icin kutsal gün” yazdýrýn. 
		//“Pazar” ise ekrana  “Hýristiyanlar icin kutsal gün” yazdýrýn
		
		Scanner scan= new Scanner (System.in);
		System.out.println("Lutfen bir gun giriniz");
		
		String day= scan.next();
		
		if(day.equals("Cuma") ){
			System.out.println("Muslumanlar icin kutsal gun");
		}else if(day.equals("Cumartesi")){
			System.out.println("Yahudiler icin kutsal gun");
		}else if (day.equals("Pazar")) {
			System.out.println("Hristiyanlar icin kutsal gun");
		}else {
			System.out.println("Gecersiz bir gun girdiniz");
		}


	}

}
