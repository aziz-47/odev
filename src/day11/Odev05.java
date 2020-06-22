package day11;

import java.util.Scanner;

public class Odev05 {

	public static void main(String[] args) {
		//Kullanýcýdan baþlangýç ve bitiþ  deðerlerini alýn 
		//ve baþlangýç deðerinden baþlayýp bitiþ deðerinde  biten tüm tamsayýlarýn çarpýmýný ekrana yazdýrýn
		
		Scanner scan= new Scanner (System.in);
		System.out.println("Baslangic degerini giriniz");
		int num1;
		num1= scan.nextInt();
		System.out.println("Bitis degerini girniz");
		int num2;
		num2=scan.nextInt();
		
		int product= 1;
		for(int i= num1; i<= num2; i++) {
			product=product*i;
		}
		System.out.println(product);
		
		scan.close();

	}

}
