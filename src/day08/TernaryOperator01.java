package day08;

import java.util.Scanner;

public class TernaryOperator01 {

	public static void main(String[] args) {
		// Kullanicidan bir sayi aliniz
        // Sayi pozitif veya 0 ise ekrana "Pozitif veya 0" yaziniz.
        // Sayi negatif ise ekrana "Negatif" yaziniz.
		
		
		Scanner scan= new Scanner (System.in);
		System.out.println("Kullanicidan bir sayi aliniz");
		int num= scan.nextInt();
		
		
		String sonuc = num>=0  ?  "pozitif" : "negatif";
		System.out.println(sonuc);
		

	}

}
