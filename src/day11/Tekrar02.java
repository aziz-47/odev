package day11;

import java.util.Scanner;

public class Tekrar02 {

	public static void main(String[] args) {
		// // Kullanicidan ismini girmesini isteyin.
        // Isminin son harfini ekrana yazdirin.
		
		Scanner scan= new Scanner (System.in);
		System.out.println("isiim giriniz");
		String isim= scan.next();
		
		int lenght= isim.length();
		System.out.println(isim.charAt(lenght-1));

	}

}
