package gungunodev;

import java.util.Scanner;

public class IfElseOdev12 {

	public static void main(String[] args) {
		// Kullan�c�dan bir tamsay� al�n e�er tamsay� 0 dan kucuk ise ekrana �Negatif� yazd�r�n. 
		//0 ise ekrana �N�tr� yazd�r�n. 0 dan b�y�k ise ekrana �Pozitif� yazd�r�n
		
		Scanner scan= new Scanner (System.in);
		System.out.println("Bir tam sayi giriniz");
		int num= scan.nextInt();
		
		if(num<0) {
			System.out.println("Negatif");
		}else if(num==0) {
			System.out.println("Notr");
		}else {
			System.out.println("Pozitif");
		}

	}

}
