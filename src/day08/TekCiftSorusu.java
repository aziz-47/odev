package day08;

import java.util.Scanner;

public class TekCiftSorusu {

	public static void main(String[] args) {
		// Kullanýcýdan bir tamsayý girmesini isteyin,
		 //tamsayý çift ise ekrana “Çift” tek ise ekrana “Tek” yazdýrýn.
		
		Scanner scan= new Scanner (System.in);
		System.out.println("Kullanicidan bir tam sayi giriniz");
		int num= scan.nextInt();
		
		
	String result=	(num%2==0) ?  "Cift" : "Tek";
	System.out.println(num + " " + result+ "tir");
	
	scan.close();
		
	}

}
