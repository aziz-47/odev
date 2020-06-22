package day22;

public class OdevSorusu01 {

	private static Object arr2;

	public static void main(String[] args) {
		// Bir integer array oluþturunuz ve bu array’deki tum sayýlarýn çarpýmýný For-each loop kullanarak bulunuz.
		//Sonucu ekrana yazdýrýnýz. 
		
		
		
		int arr[]= {9, 12,15,18,24, 11};
		
		int product=1;
		
		for( int w: arr) {
			product= product*w;
		}
		System.out.println(product);
		
		
		
		// multi Dimensional array
		
		int arr1[][]= { {5,4}, {6,8}, {9} };
		
		int product1=1;
		
	for(int[]  w : arr1) {
		
		for(int z: w) {
			product1= product1*z;
		}
	}
	
	System.out.println(product1);

	}

}
