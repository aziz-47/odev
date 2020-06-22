package day14;

import java.util.Scanner;

public class OdevSorusu06 {

	public static void main(String[] args) {
	
		//Aşağıdaki soruları do-while loop kullanarak çözünüz.
		//Kullanıcıdan bir String alın ve bu String’in icinde “a” harﬁ varsa ekrana “a harﬁ var” yazdırın.
		//“a” harﬁ yoksa tekrar bir String girmesini isteyin.
		
		Scanner scan= new Scanner (System.in);
		
		String str;
		
		do {
			System.out.println("lutfen bir kelime veya cumle giriniz");
			str= scan.nextLine();
			
			if(str.contains("a")) {
				System.out.println("a harfi var");
			}else {
				System.out.println("tekrar bir string giriniz");
			}
			
			
			
		}while(!(str.contains("a")));
		
		scan.close();
		
		
	}

}
