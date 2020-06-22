package gungunodev;

import java.util.Scanner;

public class IfElseOdev05 {

	public static void main(String[] args) {
		/*Kullanýcýdan bir tamsayý alýn
		 *  eðer tamsayý 10 dan kucuk ve 0’dan büyük eþit ise 
		 *  ekrana “Rakam” yazdýrýn. 
		 *  Diðer durumlarda ekrana “Sayý” yazdýrýn.
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
