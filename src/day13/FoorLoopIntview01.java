package day13;

import java.util.Scanner;

public class FoorLoopIntview01 {

	public static void main(String[] args) {
		//Kulanicidan bir string alin ve bu strungi ekrana tersten yazdirin
		// foor loop kullanin
		
//		Scanner scan= new Scanner (System.in);
//		System.out.println("bi kelime veya cumle giriniz");
//		String str= scan.nextLine();
//		
//		
//		for(int i= str.length()-1; i>=0; i--) {
//			System.out.print(str.charAt(i));
//		}
//		scan.close();
		
		
		
		
		Scanner scan= new Scanner (System.in);
		System.out.println("bir kelime ya da cumle aliniz");
		String str= scan.nextLine();
		
		for(int i= str.length()-1; i>=0; i--) {
			System.out.print(str.charAt(i));
		}
		

	}

}
