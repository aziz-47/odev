package day15;

import java.util.Scanner;

public class Odev03 {

	public static void main(String[] args) {
		// Kullan�c�ya say� girmesini s�yleyin.
		//Kullan�c�n�n girdi�i say�n�n rakamlar� toplam�n� ekrana  yazd�ran bir program yaz�n.
		
		
		Scanner scan= new Scanner (System.in);
		System.out.println("Bir sayi giriniz");
		int num= scan.nextInt();
		
		int sum=0;
		
		rakamlarToplami(num, sum);
		scan.close();

	}
	
	public static void rakamlarToplami(int num, int sum) { 
		
		while(num>=1) {
			
			sum= sum+ (num%10);
			num= num/10;
		}
		System.out.println("Rakamlar toplami: " + sum);
	}
	
	
	
	

}
