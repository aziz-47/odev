package gungunodev;

import java.util.Scanner;

public class IfElseOdev06 {

	public static void main(String[] args) {
		// Kullan�c�dan bir y�l al�n 
				//e�er y�l 1000�e bolunuyorsa ekrana �Milenyum� yazd�r�n.
				//E�er y�l 100�e bolunuyorsa ekrana �Y�zy�l� yazd�r�n.
				//E�er y�l 10�a bolunuyorsa ekrana �Ony�l� yazd�r�n.
		
		
		Scanner scan= new Scanner (System.in);
		System.out.println("kullanicidan bir yil isteyiniz");
		int yil= scan.nextInt();
		
		if(yil%1000==0) {
			System.out.println("millenyum");
		}else if(yil%100==0) {
			System.out.println("yuzyil");
		}else if(yil%10==0) {
			System.out.println("onyil");
		}else {
			System.out.println("herhangi bir yil ");
		}
		

	}

}
