package day13;

import java.util.Scanner;

public class Odev02 {

	public static void main(String[] args) {
		 	
		//Kullan�c�dan ba�lang�� ve biti�  de�erlerini al�n 
		//ve ba�lang�� de�erinden ba�lay�p biti� de�erinde  biten
		//3 ve 5 ile b�l�nebilen t�m tamsay�lar� ekrana yazd�r�n�z.
		
		
		Scanner scan= new Scanner (System.in);
		System.out.println("Baslangic degrini giriniz");
		int baslangic= scan.nextInt();
		
		System.out.println("Bitis degerini giriniz");
		int bitis= scan.nextInt();
		
		System.out.println("For loop ile cozumu");
		
		for(int i= baslangic; i<bitis; i++) {
			if(i%3==0 && i%5==0) {
				System.out.print(i+ " ");
			}
			
		}
		
		
		
		

	}

}
