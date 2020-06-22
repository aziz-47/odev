package day10;

import java.util.Scanner;

public class Tekrar03 {

	public static void main(String[] args) {
		//// Kullanıcıdan ilk ve soy ismini alın
		//ilk ve soy isminin ilk harﬂerini büyük harf olarak ekrana yazdırın
		
		Scanner scan=new Scanner (System.in);
		System.out.println("ilk isminizi girniz");
		String ilkIsim= scan.nextLine();
		
		System.out.println("soyIsmi giriniz");
		String soyIsim=scan.nextLine();
				
		System.out.println(ilkIsim.substring(0, 1).toUpperCase());
		System.out.println(soyIsim.substring(0, 1).toUpperCase());
		
		

	}

}
