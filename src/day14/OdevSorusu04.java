package day14;

import java.util.Scanner;

public class OdevSorusu04 {

	public static void main(String[] args) {
		// Kullan�c�ya iki say� girmesini s�yleyin.
		//Bu say�lar e�it ise ekrana �Kare olu�turdunuz� yazd�r�n. 
		//E�it de�ilse tekrar iki say� girmesini s�yleyin.
		
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
