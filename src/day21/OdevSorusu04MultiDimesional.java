package day21;

import java.util.Arrays;

public class OdevSorusu04MultiDimesional {

	public static void main(String[] args) {
		//  Aşağıdaki multi dimensional array’in iç array’lerindeki
		//tum elemanların toplamını birer birer bulan  veherbir sonucu yeni bir array’in
		//elemanı yapan ve yeni array’i ekrana yazdıran bir program yazınız 
		//{ {1,2,3}, {4,5}, {6,7} }
		//Ornegin; { {1,2,3}, {4,5}, {6,7} }  ==> 1+2+3=6  4+5=9  6+7=13  ==>  output: {6, 9, 13}
		
		int arr[][]= { {1,2,3}, {4,5}, {6,7} };
		
		int sum=0;
		int sum1=arr[0][0]+arr[0][1]+ arr[0][2];
		System.out.println(sum1);//6
		
		int sum2=arr[1][0]+ arr[1][1];
		System.out.println(sum2);//
		
		int sum3= arr[2][0]+arr[2][0]+arr[2][1];
		System.out.println(sum3);//19
		
		int arr1[][]= new int[0][2];
		arr1[0][0]= 6;
		arr1[0][1]=9;
		arr1[0][2]=19;
		
		System.out.println(Arrays.deepToString(arr1));
		 
		 

	}

}
