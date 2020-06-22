package day13;

import java.util.Scanner;

public class Odev06 {

	public static void main(String[] args) {
		// Kullanıcıdan bir String alın ve bu String’in icinde “a” harﬁ varsa “a” harﬁnin ilk görünümünün 
		//indexini ekrana yazdırın.
		//“a” harﬁ yoksa ekrana “a harﬁ yok” yazdırın.
		
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Bir string giriniz");
		String str= scan.nextLine();
		
		
		if( str.contains("a")) {
			System.out.println(str.indexOf("a"));
			
		}else {
			System.out.println("a harfi yok");
		}
		scan.close();

	}

}
