package day16;

import java.util.Scanner;

public class Odev01 {

	public static void main(String[] args) {
		//// Kullanýcýya sayý girmesini söyleyin.
		//Kullanýcýnýn girdiði sayýnýn rakamlarý toplamýný ekrana  yazdýran bir program yazýn.
		 Scanner scan= new Scanner (System.in);
		  System.out.println("Bir sayi giriniz");
		  int num= scan.nextInt();
		  
		  rakamlarToplami(num);
		  
	}
	
	public static void rakamlarToplami( int num) {
		int sum=0;
		
		while(num!=0) {
			sum= sum+ num%10;
			num= num/10;
			
		}
		System.out.println(sum);
		
	}
	

}
