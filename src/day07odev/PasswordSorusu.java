package day07odev;

import java.util.Scanner;

public class PasswordSorusu {

	public static void main(String[] args) {
		//Kullan�c�dan password girmesini isteyin. 
		//Girdi�i password 5�e b�l�n�yorsa son rakam�n� kontrol edin.
		//Son rakam� 0 ise ekrana �5�e b�l�nen �ift say�� yazd�r�n.
		//Son rakam� 0 de�il ise �5�e b�l�nen tek say�� yazd�r�n. 
		//Girdi�i password 5�e b�l�nm�yorsa ekrana �Tekrar deneyin� yazd�r�n.
		
		
		Scanner scan= new Scanner (System.in);
		System.out.println("Password giriniz");
		int password = scan.nextInt();
		
		
		if(password%5==0) {
			
			if(password%10==0) {
				System.out.println("5'e bolunebilen cift sayi");
			}else if( password%10!=0) {
				System.out.println("5'e bolunen tek sayi");
			}
			
			
		}else {
			System.out.println("Tekrar deneyin");
		}
		
		
		scan.close();
		

	}

}
