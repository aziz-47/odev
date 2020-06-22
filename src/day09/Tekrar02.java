package day09;

import java.util.Scanner;

public class Tekrar02 {

	public static void main(String[] args) {
        // Kullanici haftanin gun numarasini girsin
        // Programiniz gunun ismini yazsin
        // Yanlis gun sayisi girerse "Gecerli gun sayisi giriniz"
        // switch() kullanarak yapiniz.
		
		Scanner scan=new Scanner (System.in);
		System.out.println("gun numarasini girniz");
		int gunNum= scan.nextInt();
		
		switch(gunNum) {
		case 1:
			System.out.println("paartresi");
			break;
		case 2:
			System.out.println("sali");
			break;
		case 3:
			System.out.println("carsamba");
			break;
		case 4:
			System.out.println("persmbe");
			break;
		case 5:
			System.out.println("cuma");
			break;
		case 6:
			System.out.println("cumartesi");
			break;
		case 7:
			System.out.println("pazar");
			break;
			default:
				System.out.println("gecerli gun sayisi giriniz");
			
		
		}
        
		
	
	}

}
