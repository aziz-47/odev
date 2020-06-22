package day14;

import java.util.Scanner;

public class OdevSorusu04 {

	public static void main(String[] args) {
		// Kullanýcýya iki sayý girmesini söyleyin.
		//Bu sayýlar eþit ise ekrana “Kare oluþturdunuz” yazdýrýn. 
		//Eþit deðilse tekrar iki sayý girmesini söyleyin.
		
		Scanner scan= new Scanner(System.in);
		System.out.println("birinci sayiyi giriniz");
		int num1= scan.nextInt();
		
		System.out.println("Ikinci sayiyi giriniz");
		int num2= scan.nextInt();
		
		
		
		do {
			if(num1==num2) {
				System.out.println("Kare olusturdunuz");
				num1++;
				
			}else {
				System.out.println("Tekrar iki sayi giriniz");
			}
			
			
		}while(num1==num2);
		
		
		scan.close();
		
		

	}

}
