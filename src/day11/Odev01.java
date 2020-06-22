package day11;

import java.util.Scanner;

public class Odev01 {

	public static void main(String[] args) {
		//Kullanýcýdan baþlangýç ve bitiþ  deðerlerini alýn ve
		//baþlangýç deðerinden baþlayýp bitiþ deðerinde  biten tüm tamsayýlarý ekrana yazdýrýn.
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Kullanicidan baslangic saysisni aliniz");
		int num1;
		num1=scan.nextInt();
		
		System.out.println("Kullanicidan bitis sayisni aliniz");
		int num2;
		num2= scan.nextInt();
		
		for(int i= num1; i<=num2; i++) {
			System.out.print(i);
		}
		scan.close();


	}

}
