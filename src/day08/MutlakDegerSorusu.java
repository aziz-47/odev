package day08;

import java.util.Scanner;

public class MutlakDegerSorusu {

	public static void main(String[] args) {
		//Kullan�c�dan bir tamsay� girmesini isteyin, 
		//ekrana o tamsay�n�n mutlak degerini yazd�r�n
		
		Scanner scan =new Scanner (System.in);
		System.out.println("Lutfen bir tam sayi giriniz");
		int num= scan.nextInt();
		
		int result= (num>0) ?  num*(+1) : num;
		System.out.println(result);
		
		scan.close();
	}

}
