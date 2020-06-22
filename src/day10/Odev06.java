package day10;

import java.util.Scanner;

public class Odev06 {

	public static void main(String[] args) {
		//Kullanıcıdan yaşadığı ülkenin ismini alın
		//bu ülkenin ilk iki harﬁni büyük harf olarak ekrana yazdırın
		
		Scanner scan= new Scanner (System.in);
		System.out.println("Yasadiginiz ulkenin adini giriniz");
		String ulke = scan.nextLine();
		
		
		System.out.println(ulke.substring(0,2).toUpperCase());
		
		scan.close();
		
		

	}

}
