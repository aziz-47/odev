package day21;

public class OdevSorusu03MultiDimesional {

	public static void main(String[] args) {
		// Aþaðýdaki multi dimensional array’lerin iç array’lerinde
		//ayný index’e sahip elemanlarýn toplamýný  ekrana yazdýran bir program yazýnýz 
		//arr1 = { {1,2}, {3,4,5}, {6} }  ve  arr2 = { {7,8,9}, {10,11}, {12} }
//		
//		int arr1[][]={ {1,2}, {3,4,5}, {6} };
//		int arr2[][]=  { {7,8,9}, {10,11}, {12} };
//		
//		int sum=0;
//		
//		int t1 = arr1[0][0]+arr2[0][0];
//		int t2 = arr1[0][1]+arr2[0][1];
//		
//		int t3 = arr1[1][0]+arr2[1][0];
//		int t4 = arr1[1][1]+arr2[1][1];
//		
//		int t5 = arr1[2][0]+arr2[2][0];
//					
//		int toplama = t1+t2+t3+t4+t5;
//		
//		sum=sum+toplama;
//		System.out.println(sum);
		
		
		
		int arr2[][] = { {1,2}, {3,4,5}, {6} };
		int arr3[][] = { {7,8,9}, {10,11}, {12} };
			
			int sum = 0;
			for(int i=0;i<arr2.length; i++) {	
			for(int j=0; j<arr2[i].length; j++) {
				for(int i1=0; i1<arr3.length; i1++)	{
				for(int j1=0; j1<arr3[i1].length; j1++)	{
					if(i==i1 && j==j1) {
						sum = sum+ arr2[i][j] + arr3[i1][j1];
					}			
				}			
				}
				}
			}
			System.out.println(sum);
		
		
		
	

		}
	}
