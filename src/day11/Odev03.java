package day11;

import java.util.Scanner;

public class Odev03 {

	public static void main(String[] args) {
		// Kullanýcýdan baþlangýç ve bitiþ  deðerlerini alýn ve baþlangýç deðerinden 
		//veya sonrasýndan   baþlayýp bitiþ deðerinde
		//veya öncesinde  biten tüm 3 ile bölünebilen tamsayýlarý ekrana yazdýrýn. 
		
		Scanner scan= new Scanner (System.in);
		System.out.println("Baslangic degerini giriniz");
		int num1;
		num1= scan.nextInt();
		System.out.println("Bitis degerini girniz");
		int num2;
		num2=scan.nextInt();
		
		
		for(int i=num1; i<=num2; i+=3) {
			System.out.print(i + " ");
		}
		
		scan.close();
		

	}

}
