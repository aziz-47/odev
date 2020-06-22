package day12;

import java.util.Scanner;

public class Odev06 {

	public static void main(String[] args) {
		// Kullanıcıdan başlangıç ve bitiş  harﬂerini alın ve başlangıç 
		//harﬁnden başlayıp bitiş harﬁnde  biten tüm harﬂeri büyük harf 
		//olarak ekrana yazdırın. Kullanıcının hata yapmadığını farz edin.
		
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Baslangic harfini aliniz");
		char baslangic=scan.next().toUpperCase().charAt(0);
		
		System.out.println("bitis harfini girniz");
		char bitis=scan.next().toUpperCase().charAt(0);
		
		char num= baslangic;
		
		while(num<= bitis) {
			
			System.out.println(Character.toString(num)+ num+ " ");
			num++;
			
			scan.close();
		}
		

		
		

	}

}
