package day14;

import java.util.Scanner;

public class Tekrar03 {

	public static void main(String[] args) {
		// Kullanicidan bir String alin
		// Bu String'in indexi tek sayi olan character'lerini ekrana yazdirin
		// Almanya ==> l, a, y ==> yazdirmali
		
		Scanner scan= new Scanner(System.in);
		System.out.println("bir kelime veya cumle giriniz");
		String str= scan.nextLine();
		
		int lenght= str.length();
		int i =0;
		
		do {
			if(i%2==1) {
				System.out.println(str.charAt(i)+ " ");
				
			}i++;
			
			
		}while (i<lenght);
		
		
	}

}
