package gungunodev;

import java.util.Scanner;

public class IfElseOdev03 {

	public static void main(String[] args) {
		// Kullan�c�dan bir tamsay� al�n e�er tamsay� 3 ile b�l�nebiliyorsa ekrana �3��n kat�� yazd�r�n.
				// 3 ile b�l�nemiyorsa ekrana �3��n kat� de�ildir� yazd�r�n
		
		Scanner scan= new Scanner (System.in);
		System.out.println("Bir tam sayi aliniz");
		int sayi= scan.nextInt();
		
		if(sayi%3==0) {
			System.out.println(" 3'un kati");
		}else {
			System.out.println(" 3'un kati degil");
		}

	}

}
