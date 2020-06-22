package day15;

import java.util.Scanner;

public class Odev04 {

	public static void main(String[] args) {
		// Kullan�c�ya paralelkenar, dikd�rtgen ve ��gen kelimelerinden birini ve iki say� se�mesini s�yleyin. 
		//Hangi �ekli se�erse, o �eklin alan�n� ve �evresini ekrana yazd�ran program� yaz�n�z
		
		
		Scanner scan= new Scanner (System.in);
		System.out.println("Paralelkenar, dikdotgen ve ucgen kelimerlden birini giriniz");
		String cokgen= scan.nextLine().toLowerCase();
		System.out.println("Birinici sayiyi giriniz");
		int num1= scan.nextInt();
		System.out.println("Ikinic sayiyi giriniz");
		int num2= scan.nextInt();
		
		hesaplama(cokgen, num1, num2);
		
		scan.close();
		
		
		
	}
	
	public static void hesaplama( String cokgen, int num1 , int num2) {
		switch(cokgen) {
		case "paralelkenar":
			System.out.println("Paralelkenar alani: " + (num1*num2));
			break;
		case "dikdortgen":
			System.out.println("Dikdortgenin alani: " + (num1*num2));
			break;
		case "ucgen":
			System.out.println("ucgenin alani: " + (num1*num2)/2);
			break;
			default:
				System.out.println("paralelkenar, dikdortgen ve ucgenden birini seciniz");
		
		
		}
	
	 
	 }

}
