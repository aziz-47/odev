package day10;

import java.util.Scanner;

public class Odev03 {

	public static void main(String[] args) {
		//Kullan�c�dan ilk ve soy ismini al�n ilk ve soy isminin ka� harften olu�tu�unu ekrana yazd�r�n
		
		Scanner scan= new Scanner (System.in);
		System.out.println("ilk ve soyismini giriniz");
		
		String tamIsim= scan.nextLine();
		
		System.out.println(tamIsim.length()-1);
		
		scan.close();
		

	}

}
