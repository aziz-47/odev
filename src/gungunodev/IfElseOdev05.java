package gungunodev;

import java.util.Scanner;

public class IfElseOdev05 {

	public static void main(String[] args) {
		/*Kullan�c�dan bir tamsay� al�n
		 *  e�er tamsay� 10 dan kucuk ve 0�dan b�y�k e�it ise 
		 *  ekrana �Rakam� yazd�r�n. 
		 *  Di�er durumlarda ekrana �Say�� yazd�r�n.
		 */
		
		Scanner scan=new Scanner (System.in);
		System.out.println("bir tam sayi griniz");
		int sayi= scan.nextInt();
		
		if((sayi<10) && (sayi>=0)){
			System.out.println("rakam");
		}else {
			System.out.println("sayi");
		}


	}

}
