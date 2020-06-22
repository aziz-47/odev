package day10;

import java.util.Scanner;

public class Tekrar05 {

	public static void main(String[] args) {
		// //Kullanıcıdan yaşadığı ülkenin ismini alın 
		//bu ülkenin bastan ikinci harﬁ ile sondan ikinci harﬁni  büyük harf olarak ekrana yazdırın. 
		
		Scanner scan= new Scanner (System.in);
		System.out.println("ulkeninizin adini giriniz");
		String ulke= scan.nextLine();
		
		System.out.println(ulke.substring(1, 2).toUpperCase()+ulke.toUpperCase().charAt(ulke.length()-2));
	}

}
