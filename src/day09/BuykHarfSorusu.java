package day09;

import java.util.Scanner;

public class BuykHarfSorusu {

	public static void main(String[] args) {
//		Kullanıcıdan A, B, C, D harﬂerinden birini alın eğer harf C ise ekrana “Doğru cevap” yazdırın.
//		A, B, D den biri ise ekrana “Yanlış cevap” yazdırın.
//		Bu harﬂerin dışındaki harﬂer için “Geçersiz cevap şıkkı” yazdırın.
		
		Scanner scan=new Scanner (System.in);
		System.out.println("Kullanicidan A,B,C,D harfI aliniz");
		char ch= scan.next().charAt(0);
		
		
		switch(ch) {
		case 'C':
			System.out.println("Dogru cevap");
			break;
		case 'A':
			System.out.println("Yalniscevap");
			break;
		case 'B':
			System.out.println("Yalnis cevap");
			break;
		case 'D':
			System.out.println("Yalnis cevap");
			break;
			default:
				System.out.println("Gecersiz cevap sikki");
		
		}
		scan.close();


	}

}
