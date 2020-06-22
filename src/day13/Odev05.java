package day13;

import java.util.Scanner;

public class Odev05 {

	public static void main(String[] args) {
		// Kullanıcıdan bir String alın ve bu String’in ilk harﬁ ile son harﬁnin yerlerini değiştirerek  
		//ekrana yazdırın. Ornegin; Kullanıcı “Java” girerse ekrana “aavJ” yazdıracaksınız.
		
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Bir string giriniz");
		String str=scan.nextLine();
		
		System.out.println(str.charAt(str.length() -1 )+ str.substring(1, str.length() -1)+ str.charAt(0));


	}

}
