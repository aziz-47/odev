package day15;

import java.util.Scanner;

public class Odev02 {

	public static void main(String[] args) {
		// //Kullanýcýdan iki sayý alýn bu sayýlar eþit ise ekrana “Eþit”, 
		//birinci sayý büyük ise ekrana “Birinci sayý büyük”,
		//ikinci sayý büyük ise ekrana “Ikinci sayý büyük” yazdýrýnýz.
		
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
