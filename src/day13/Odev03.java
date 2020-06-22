package day13;

import java.util.Scanner;

public class Odev03 {

	public static void main(String[] args) {
		// Kullanýcýdan bir sayý alýn ve bu sayýnýn bölenlerini ekrana yazdýrýnýz.
		//Ornegin; 12'nin bölenleri 1, 2, 3, 4, 6, 12 dir.
		
		Scanner scan= new Scanner (System.in);
		System.out.println("Bir sayi giriniz");
		int num= scan.nextInt();
		
		System.out.println("for loop ile cozumu");
		
		for(int i= 1; i<=num; i++) {
			if(num%i==0) {
				System.out.print(i +" ");
			}
			
			System.out.println("while ile cozumu");
		}
		

	}

}
