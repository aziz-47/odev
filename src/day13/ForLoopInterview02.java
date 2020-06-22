package day13;

import java.util.Scanner;

public class ForLoopInterview02 {

	public static void main(String[] args) {
		// / //Kulanicidan bir string alin ve bu strungi ekrana tersten yazdirin
		// while loop kullanin
		
		
//		Scanner scan= new Scanner(System.in);
//		System.out.println("Bir sayi giriniz");
//		String str= scan.nextLine();
//		
//		int lenght= str.length()-1;
//		
//		while(lenght>=0) {
//			System.out.print(str.charAt(lenght));
//			lenght--;
//		}
		
		
		
		
		Scanner scan= new Scanner(System.in);
		System.out.println("bir kelime veya cumle giriniz");
		String str= scan.nextLine();
		
		int lenght= str.length()-1;
		while(lenght>=0) {
			System.out.print(str.charAt(lenght));
			lenght--;
		}
		
		

	}

}
