package day11;

import java.util.Scanner;

public class Odev03 {

	public static void main(String[] args) {
		// Kullan�c�dan ba�lang�� ve biti�  de�erlerini al�n ve ba�lang�� de�erinden 
		//veya sonras�ndan   ba�lay�p biti� de�erinde
		//veya �ncesinde  biten t�m 3 ile b�l�nebilen tamsay�lar� ekrana yazd�r�n. 
		
		Scanner scan= new Scanner (System.in);
		System.out.println("Baslangic degerini giriniz");
		int num1;
		num1= scan.nextInt();
		System.out.println("Bitis degerini girniz");
		int num2;
		num2=scan.nextInt();
		
		
		for(int i=num1; i<=num2; i+=3) {
			System.out.print(i + " ");
		}
		
		scan.close();
		

	}

}
