package gungunodev;

import java.util.Scanner;

public class IfElseIfOdev11 {

	public static void main(String[] args) {
		//)Kullan�c�dan bir gun al�n e�er gun �Cuma� ise ekrana �M�sl�manlar icin kutsal g�n� yazd�r�n.
		//�Cumartesi� ise ekrana �Yahudiler icin kutsal g�n� yazd�r�n. 
		//�Pazar� ise ekrana  �H�ristiyanlar icin kutsal g�n� yazd�r�n
		
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
