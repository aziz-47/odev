package day09;

import java.util.Scanner;

public class RakamSorusu {

	public static void main(String[] args) {
//		Kullan�c�dan bir tamsay� al�n e�er tamsay� 9 ise ekrana �Bir basamakl� en b�y�k say�� yazd�r�n.
//		99 ise ekrana ��ki basamakl� en b�y�k say�� yazd�r�n. 999 ise ekrana ��� basamakl� en b�y�k say�� yazd�r�n.
//		Bu say�lar�n d���ndaki say�lar i�in �Yorum yok� yazd�r�n. 
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir tam sayi giriniz");
		int num= scan.nextInt();
		
		switch(num) {
		case 9 :
			System.out.println("Bir basamakli en buyuk sayi");
			break;
		case 99 :
			System.out.println("Iki basamakli en buyuk sayi");
			break;
		case 999 :
			System.out.println("Uc basamakli en buyuk sayi");
			break;
			default:
				System.out.println("Yorum yok");
			
		}
		scan.close();
	
	}

}
