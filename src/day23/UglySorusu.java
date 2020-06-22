package day23;

import java.util.Scanner;

public class UglySorusu {

	public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
		    int num = sc.nextInt();
		    if (findUgly(num)) {
		    	System.out.println("ugly number");
		    } else {
		    	System.out.println("ugly number  degildir");
		    }
		    
		    
		    sc.close();
		  }
		  
		  public static boolean isPrime (int num) {
			   
			   for (int i = 2; i < num; i++) {
				   if (num % i == 0)
					   return false;
			   }
			   return true ;
		  
		  }
		  
		  public static boolean findUgly (int num) {
			  for (int i =7; isPrime(i) && i < num; i++) {
				  if (num % i == 0 || isPrime(num)) return false;
				  
			  }
			  
			  return true;


	}

}
