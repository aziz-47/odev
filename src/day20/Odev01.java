package day20;

import java.util.Arrays;
import java.util.Scanner;

public class Odev01 {

	public static void main(String[] args) {
		// Kullanýcýya kaç elemanlý bir array gireceðini sorun. 
		//Kullanýcýdan array’in elemanlarýný girmesini isteyin. a) Bu array’in tum elemanlarýný ekrana yazdýrýn.
		//b) Bu arayýn son elemanýný ilk eleman yapýn ve tum elemanlarýný ekrana yazdýrýn.     
		//Mesela; array {1, 2, 3} ise ekrana {3, 1, 2} seklinde yazdýrýn.
		
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Kac elemanli bir arrays giriniz");
		int lenght= scan.nextInt();
		
		int arr1[]= new int[lenght];
		
		System.out.println("Arrays eleamnlrini giriniz");
		for(int i=0; i<lenght; i++)
			arr1[i] = scan.nextInt();
		
		
		int arr2[] = new int[lenght];
		for(int i=1; i<lenght; i++) {
			arr2[i-1]=arr2[i];
		}
		arr2[lenght-1]= arr2[0];
		
		System.out.println(Arrays.toString(arr2));
		
		
		
	}

}
