package day15;

import java.util.Scanner;

public class Tekrar02 {

	public static void main(String[] args) {
		////basit hesap makinsi
		// kullanicidan yapacagi islemi islem sembolu ile secmasini saglayalim
		// kullanicdan iki sayio girmesini istyelim
		//bilinen iki sayi ve secilen islme gore dogru sonucu ekrana yazdiralim
		
		Scanner scan= new Scanner (System.in);
		System.out.println("+, -, x , : islemlerinden birini giriniz");
		char islem= scan.next().charAt(0);
		System.out.println("iki sayi  giriniz");
		double num1= scan.nextDouble();
		double num2= scan.nextDouble();
		
		
		hesapMakinasi(islem, num1 , num2);
		
		scan.close();
		
		

	}
	
	public static void hesapMakinasi(char islem, double num1, double num2) {
		
		switch(islem) {
		case'+':
			System.out.println(num1+ " + "  + num2 + "  =" + (num1+ num2));
			break;
		case'-':
			System.out.println(num1  + "-" + num2 + " =" + (num1-num2));
			break;
		case'x':
			System.out.println(num1  + "x"+ num2 + " =" + (num1* num2));
			break;
		case':':
			System.out.println(num1 + ":" + num2 + " =" + (num1/ num2));
			break;
			default:
			System.out.println("lutfen dogru islme giriniz");
			
			
			
			
		}
		
	}
	

}
