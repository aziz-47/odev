package gungunodev;

import java.util.Scanner;

public class IfElseOdev08 {

	public static void main(String[] args) {
		//Kullan�c�dan bir ��genin �� kenar uzunlu�unu al�n
				//e�er �� kenar uzunlu�u birbirine e�it ise 
				//ekrana �E�kenar ��gen� yazd�r�n.
				// Sadece iki kenar uzunlu�u birbirine e�it ise
				//ekrana �Ikizkenar ��gen� yazd�r�n
				//T�m kenar uzunluklar� birbirinden farkl� ise
				//��e�itkenar ��gen yazd�r�n
		
		Scanner scan= new Scanner (System.in);
		System.out.println("ucgenin 1 kenar uzunlugu isteuyiniz");
		int num1= scan.nextInt();
		System.out.println("ucgenin 2 kenar uzunllugu isteyiniz");
		int num2 = scan.nextInt();
		System.out.println("ucgenin 3. kenar uzunlugu isteuyiniz");
		int num3= scan.nextInt();
		
		if(num1==num2 && num1==num3) {
			System.out.println("eskenar  ucgen");
		}else if(num1==num2 && num1!=num3) {
			System.out.println("ikizkenar ucgen");
		}else {
			System.out.println("cesitkenar ucgen");
		}
		
		
		
		


	}

}
