package gungunodev;

import java.util.Scanner;

public class IfElseIfOdev02 {

	public static void main(String[] args) {
		 //Kullanicidan 6 basamakli bir sayi isteyin. 0 ile de baslayabilir
        //Kazanma ihtimali %20, amorti ihtimali %30, kaybetme ihtimali %50 olan bir 
        //jackpot oyunu icin program yaziniz.
        //000000-000001-000002-....-999998-999999 ==>1000000
        
		
		Scanner scan= new Scanner (System.in);
		System.out.println("Kullanicidan 6 basamakli bir ssyi isteyiniz");
		int sayi= scan.nextInt();
		
		if(sayi<200000) {
			System.out.println("kazandiniz");
		}
		else if(sayi<500000) {
			System.out.println("amorti");
		}else {
			System.out.println("kaybettiniz");
		}
		
		

	}

}
