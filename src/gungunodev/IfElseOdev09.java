package gungunodev;

import java.util.Scanner;

public class IfElseOdev09 {
	
	public static void main(String [] args) {
		
		//Kullanıcıdan alacağı ürün miktarını ve ürünün birim fiyatını alın.
				//Eğer urun miktarı 1000 den fazla ise
				//Kullanıcıya %10 indirim yapın ve ödemesi gereken toplam parayı
				//ekrana yazdırın. Diğer durumlarda ödemesi gereken toplam parayı
				//herhangi bir indirim yapmadan ekrana yazdırın.
		
		Scanner scan= new Scanner (System.in);
		System.out.println(" urun  miktarini giriniz");
		int miktar= scan.nextInt();
		
		System.out.println("birim fiyatini giriniz");
		int birimFiyati= scan.nextInt();
		
		if (miktar>1000) {
			System.out.println(miktar*(birimFiyati*90/100));
		}else {
			System.out.println("miktar*birimfiyati");
		}

		
	}

}
