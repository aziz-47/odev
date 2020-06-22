package day14;

import java.util.Scanner;

public class OdevSorusu02 {

	public static void main(String[] args) {
		// Kullanýcýdan baþlangýç ve bitiþ  deðerlerini alýn
		//ve baþlangýç deðerinden baþlayýp bitiþ deðerinde  biten
		//4 ve 6 ile bölünebilen tüm tamsayýlarý ekrana yazdýrýnýz
		
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
