package day08;

import java.util.Scanner;

public class ArtikYilSorusu {

	public static void main(String[] args) {
		//Kullan�c�dan bir y�l girmesini isteyin, 
		//y�l art�k y�l ise ekrana �Art�k y�l� degilse ekrana �Art�k y�l degil� yazd�r�n.
		
		Scanner scan= new Scanner (System.in);
		System.out.println("Bir yil giriniz");
		 int yil= scan.nextInt();
		 
		 
		String result= (yil%100==0)  ? (( yil%400==0)  ?  "Artik yil" : "Artik yil degil") :
			 (yil%4==0)  ?  "Artik yil"  : "Artik yil degil";
		System.out.println(result);
		
		scan.close();
		

	}

}
