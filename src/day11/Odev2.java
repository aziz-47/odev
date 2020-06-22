package day11;

import java.util.Scanner;

public class Odev2 {

	public static void main(String[] args) {
		// Kullanýcýdan baþlangýç ve bitiþ  deðerlerini alýn 
		//ve baþlangýç deðerinden veya sonrasýndan   baþlayýp bitiþ deðerinde 
		//veya öncesinde  biten tüm çift tamsayýlarý ekrana yazdýrýn.
		

		Scanner scan = new Scanner (System.in);
		System.out.println("Kullanicidan baslangic degerini aliniz");
		int num1;
		num1=scan.nextInt();
		
		System.out.println("Kullanicidan bitis degerini aliniz");
		int num2;
		num2= scan.nextInt();
		
		if(num1%2==0) {
			for(int i=num1; i<=num2; i+=2) {
				System.out.println(i);
			}
		}else if(num1%2!=0) {
			for(int i=num1; i<=num2; i+=2){
				System.out.print(i);
				
			}
		}
		scan.close();
		


	}

}
