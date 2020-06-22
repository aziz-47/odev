package day15;

import java.util.Scanner;

public class Tekrar01 {

	public static void main(String[] args) {
		//// Saati sniyeye , mil i kilometreye , kilogrami granma ceviren bir method yziniz
		// bu methodu main methodun disinda olusturup main methodun icinden cagiriniz
		
		
		Scanner scan= new Scanner (System.in);
		System.out.println("birimi giriniz");
		String birim= scan.nextLine().toLowerCase();
		System.out.println("miktari giriniz");
		double miktar= scan.nextDouble();
		
		donusturucu(birim, miktar);
		
		scan.close();
		
		
	}
	
	
	public static void donusturucu( String birim, double miktar) {
		
		switch(birim) {
		case"saat":
			System.out.println(miktar*60*60);
			break;
		case"mil":
			System.out.println(miktar*1.6);
			break;
		case "kilogram":
			System.out.println(miktar*1000);
			break;
			default:
				System.out.println("lutfen sadece bu birimleri giriniz");
				
		}
		
	}
	
	
	

}
