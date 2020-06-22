package day08;

import java.util.Scanner;

public class TamSayiSorusu {

	public static void main(String[] args) {
		//Kullanýcýdan iki tamsayý girmesini isteyin, ekrana her zaman büyük olanýný yazdýrýn
		
		Scanner scan= new Scanner (System.in);
		System.out.println("Lutfen 1 .sayiyi giriniz");
		int num1= scan.nextInt();
		System.out.println("Lutfen 2. sayiyi giriniz");
		int num2= scan.nextInt();
		
		
	int result=	(num1>=num2)  ?  num1  : num2;
	System.out.println(result);
	
	
	scan.close();


	}

}
