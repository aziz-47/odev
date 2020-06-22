package day07odev;

import java.util.Scanner;

public class Odev04 {

	public static void main(String[] args) {
		 // Kullanicidan  bir sayi alin
        // Bu sayi pozitif veya sifir ise 9 dan buyuk mu diye kontrol edin, 9 dan buyuk ise ekrana "Sayi" yazdirin
        // 9 dan kucuk esit ve 0'dan buyuk esit ise ekrana "Rakam" yazdirin
        // Bu sayi negatif ise ekrana "Sayi" yazdirin
		
		Scanner scan= new Scanner (System.in);
		System.out.println("Bi sayi alniz");
		int num= scan.nextInt();
		
		
		if(num>=0) {
			
			if(num>9) {
				System.out.println("sayi");
			}else if(num<=9 && num>=0) {
				System.out.println("rakam");
			}
		}else if(num<0) {
			System.out.println("sayi");
		}
		
	
		
		scan.close();
		
		
	  }
	
	}
