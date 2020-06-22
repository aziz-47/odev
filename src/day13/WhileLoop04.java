package day13;

import java.util.Scanner;

public class WhileLoop04 {

	public static void main(String[] args) {
		// // Kullnicinin girdgi sayi icin carpim tablosnu ekrna yazdirin
		
		Scanner scan= new Scanner(System.in);
		System.out.println("bir sayi giriniz");
		int num= scan.nextInt();
		
		System.out.println("for icin couzm");
		
		for( int i = 1; i<11; i ++) {
			System.out.println(num + "*" + i + (i*num));
		}
		
		System.out.println("while icin cozum");
		 int num1= 1;
		 while(num1<11) {
			 System.out.println(num + "*" + num1 + "=" + (num*num1));
			 num1++;
		 }

	}

}
