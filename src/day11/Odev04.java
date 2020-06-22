package day11;

import java.util.Scanner;

public class Odev04 {

	public static void main(String[] args) {
		// Kullanýcýdan baþlangýç ve bitiþ  deðerlerini alýn 
		//ve baþlangýç deðerinden baþlayýp bitiþ deðerinde  biten tüm tamsayýlarýn toplamýný ekrana yazdýrýn.
		
		Scanner scan= new Scanner (System.in);
		System.out.println("Baslangic degerini giriniz");
		int num1;
		num1= scan.nextInt();
		System.out.println("Bitis degerini girniz");
		int num2;
		num2=scan.nextInt();
		
		int sum=0;
		for(int i=num1; i<num2; i++) {
			sum= sum+ i;
		}
		System.out.println("Toplam: " + sum);
		
		scan.close();

	}


}
