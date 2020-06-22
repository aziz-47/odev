package day10;

import java.util.Scanner;

public class Tekrar02 {

	public static void main(String[] args) {
		// Kullanýcýdan ilk ve soy ismini alýn ilk ve soy isminin kaç harften oluþtuðunu ekrana yazdýrýn
		
		Scanner scan=new Scanner (System.in);
		System.out.println("ilk adinizi ve soyadinizi girniz");
		String isim= scan.nextLine();
		
		System.out.println(isim.length()-1);
		
		
		
		
	}

}
