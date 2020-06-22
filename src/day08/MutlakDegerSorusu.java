package day08;

import java.util.Scanner;

public class MutlakDegerSorusu {

	public static void main(String[] args) {
		//Kullanýcýdan bir tamsayý girmesini isteyin, 
		//ekrana o tamsayýnýn mutlak degerini yazdýrýn
		
		Scanner scan =new Scanner (System.in);
		System.out.println("Lutfen bir tam sayi giriniz");
		int num= scan.nextInt();
		
		int result= (num>0) ?  num*(+1) : num;
		System.out.println(result);
		
		scan.close();
	}

}
