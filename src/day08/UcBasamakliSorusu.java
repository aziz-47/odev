package day08;

import java.util.Scanner;

public class UcBasamakliSorusu {

	public static void main(String[] args) {
		//Kullan�c�dan bir tamsay� girmesini isteyin,
		//o tamsay� 3 basamakl� ise ekrana �3 Basamakl�� yazd�r�n. 
		//3 basamakl� degilse �ift olup olmadigini kontrol edin.
		//�ift ise �3 basamakl� olmayan �ift say�� yazd�r�n.
		//�ift say� degilse �3 basamakl� olmayan tek say� yazd�r�n.�
		
		Scanner scan= new Scanner (System.in);
		System.out.println("Bir tam sayi giriniz");
		int num= scan.nextInt();
		
	String result=	(num>99 && num<1000) ? "Uc basamakli" :
			((num%2==0) ?  "3 Basamkli olmayan cift sayi" : "3 basamakli olmayan tek sayi");
	System.out.println(result);
	
	scan.close();


	}

}
