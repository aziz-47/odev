package day15;

import java.util.Scanner;

public class Odev02 {

	public static void main(String[] args) {
		// //Kullan�c�dan iki say� al�n bu say�lar e�it ise ekrana �E�it�, 
		//birinci say� b�y�k ise ekrana �Birinci say� b�y�k�,
		//ikinci say� b�y�k ise ekrana �Ikinci say� b�y�k� yazd�r�n�z.
		
		Scanner scan= new Scanner (System.in);
		System.out.println("Birinci sayiyi giriniz");
		int num1= scan.nextInt();
		
		System.out.println("Ikinci sayiyi giriniz");
		int num2 = scan.nextInt();
		
		
		cokgen(num1, num2);
		
		scan.close();
		
	
	}
	
	public static void cokgen(int num1, int num2) {
		
		if(num1==num2) {
			System.out.println("Esit");
		}else if(num1>num2) {
			System.out.println("Birinci sayi  buyuk");
		}else if(num1<num2) {
			System.out.println("Ikinci sayi buyuk");
		}
		
		
	}

}
