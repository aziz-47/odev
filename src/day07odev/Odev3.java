package day07odev;

import java.util.Scanner;

public class Odev3 {

	public static void main(String[] args) {
		// Kullan�c�dan bir gun al�n e�er gun �Cuma� ise ekrana �M�sl�manlar icin kutsal g�n� yazd�r�n.
        //�Cumartesi� ise ekrana �Yahudiler icin kutsal g�n� yazd�r�n. 
        //�Pazar� ise ekrana �H�ristiyanlar icin kutsal g�n� yazd�r�n.
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
