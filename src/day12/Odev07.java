package day12;

import java.util.Scanner;

public class Odev07 {

	public static void main(String[] args) {
		// Kullan�c�dan bir rakam al�n ve bu rakam icin �arp�m tablosunu 
		//ekrana yazd�r�n. Kullan�c�n�n hata yapmad���n� farz edin.  Ornegin kullan�c� 
    	//3 girerse; 3x1=3 3x2=6 3x3=9 3x4=12 3x5=15 3x6=18 3x7=21 3x8=24 3x9=27 3x10=30
		
		Scanner scan= new Scanner (System.in);
		System.out.println("Lutfen bir rakam giriniz");
		int num= scan.nextInt();
		
		
		int num1 =1;
		
		while(num1<10);
		
		System.out.println(num+"x"+num1+"="+num*num1+","+" ");
		num1++;
		
		scan.close();
		
		
	}

}
