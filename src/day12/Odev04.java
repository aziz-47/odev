package day12;

import java.util.Scanner;

public class Odev04 {

	public static void main(String[] args) {
		// Kullanýcýdan baþlangýç ve bitiþ  deðerlerini alýn ve baþlangýç 
		//deðerinden baþlayýp bitiþ deðerinde  biten tüm tamsayýlarýn toplamýný ekrana yazdýrýn.
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Baslangic degerini aliniz");
		int baslangic=scan.nextInt();
		
		System.out.println("Bitis degerini aliniz");
		int bitis= scan.nextInt();
		
		int num= baslangic;
		int sum= 0;
				
		while(num<=bitis) {
			sum+=num;
			System.out.println(num + " ");
			num++;
		}System.out.println("sum:" + num);
		
		
		scan.close();


	}

}
