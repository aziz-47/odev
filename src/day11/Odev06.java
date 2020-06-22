package day11;

import java.util.Scanner;

public class Odev06 {

	public static void main(String[] args) {
		// Kullanıcıdan başlangıç ve bitiş  harﬂerini alın
		//ve başlangıç harﬁnden başlayıp bitiş harﬁnde  biten tüm harﬂeri büyük harf olarak ekrana yazdırın.
		
		
		Scanner scan= new Scanner (System.in);
		System.out.println("Baslangic harfini giriniz");
		char ch1=scan.next().charAt(0);
	    
		System.out.println("Bitis harfini girniz");
		char ch2=scan.next().charAt(0);
		
		System.out.println(ch1 + " ve " + ch2 + "arasindaki tum harfler");
		
		for(char i=ch1; i<=ch2; i++) {
			String.valueOf(i).toUpperCase();
			System.out.print(String.valueOf(i).toUpperCase() + " ");
		}
		scan.close();
		

	}

}
