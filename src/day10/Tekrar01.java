package day10;

import java.util.Scanner;

public class Tekrar01 {

	public static void main(String[] args) {
		// // Kullan�c�dan kredi kart� numaras�n� al�n ve
		//bu numaran�n ���nc�, d�rd�nc� ve sonuncu  rakamlar�n� ekrana yazd�r�n.
		
		Scanner scan= new Scanner(System.in);
		System.out.println("kredi karti numrasi aliniz");
	   String no= scan.nextLine();
	   
	   int lenght= no.length();
	   
	   System.out.println(no.charAt(2));
	   System.out.println(no.charAt(3));
	   System.out.println(no.charAt(lenght-1));
		
		
	}

}
