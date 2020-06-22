package day14;

import java.util.Scanner;

public class Tekrar04 {

	public static void main(String[] args) {
		// Kullanicidan ismini alin
		// Ilk harf buyuk harf ise "Dogru giris yaptiniz"
		// Ilk harf kucuk harf ise "Ilk harfi buyuk harf olarak giriniz"
		
		
		Scanner scan= new Scanner(System.in);
		
		String isim = "";
		
		do {
			System.out.println("lutfen isim giriniz");
			isim= scan.nextLine();
			
			if(isim.charAt(0)>='A'&& isim.charAt(0)<='Z') {
				System.out.println("dorgu giris yaptiniz");
			}else {
				System.out.println("ilk harfi buyuk giriniz");
			}
			
			
		}while(!(isim.charAt(0)>='A' && isim.charAt(0)<='Z'));
		
	}

}
