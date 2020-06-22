package day12;

import java.util.Scanner;

public class Odev05 {

	public static void main(String[] args) {
		// Kullanýcýdan baþlangýç ve bitiþ  deðerlerini alýn ve baþlangýç deðerinden 
		//baþlayýp bitiþ deðerinde  biten tüm tamsayýlarýn çarpýmýný ekrana yazdýrýn.
		
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Baslangic degerini aliniz");
		int baslangic=scan.nextInt();
		
		System.out.println("Bitis degerini aliniz");
		int bitis= scan.nextInt();
		
		int num= baslangic;
		 int product=1;
		 
		 while(num<=bitis) {
			 product*=num;
			 num++;
		 }System.out.println(product);
		 
		 
		 scan.close();

	}

}
