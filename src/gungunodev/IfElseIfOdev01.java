package gungunodev;

import java.util.Scanner;

public class IfElseIfOdev01 {

	public static void main(String[] args) {
		// Kullanicidan sinav notunu tam sayi oalrak girmesini  isteyin
				// negatif girerse ekrana yalisn deger girdiniz desin
				//  0 dan buyk ve esit 50 den kucuk girerse ekrana kaldiniz yadrin
				//50 den buyuk ve esit 80 den kucuk ise ekrana gectiniz yazdirin
				// 80 den byuyuk ve esit  100 den kucuk ise ekrana tebrikler yazdriin
				
		Scanner scan  =new Scanner (System.in);
		System.out.println("sinav notunu isteyini");
		
		int not= scan.nextInt();
		
		if(not<0) {
			System.out.println("yalnis deger girdiniz ");
		}
		else if(not<50) {
			System.out.println("kaldiniz");
		}
		else if(not<80) {
			System.out.println("gectiniz");
			
		}
		else {
			System.out.println("tebrikler");
		}
		

	}

}
