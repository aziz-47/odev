package day14;

import java.util.Scanner;

public class OdevSorusu02 {

	public static void main(String[] args) {
		// Kullan�c�dan ba�lang�� ve biti�  de�erlerini al�n
		//ve ba�lang�� de�erinden ba�lay�p biti� de�erinde  biten
		//4 ve 6 ile b�l�nebilen t�m tamsay�lar� ekrana yazd�r�n�z
		
		Scanner scan= new Scanner (System.in);
		 System.out.println("baslangic degerini giriniz");
		 int baslangic= scan.nextInt();
		 
		 System.out.println("bitis degerini giriniz");
		 int bitis= scan.nextInt();
		 
		 int i= baslangic;
		 
		 do {
			 if(i%4==0 && i%6==0) {
				 System.out.println(i + " ");
			 }i++;
			 
			 
		 }while(i<=bitis);
		
		
		
	}

}
