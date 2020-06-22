package day21;

public class Tekrar03 {

	public static void main(String[] args) {
		
		
	   // for loop ile cozum
		int arr[][] = { {1, 2}, {3}, {4, 5, 6}};
		
		int product= 1;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				product= product*arr[i][j];
			}
		}System.out.println(product);
		
		
		
		//for each loop ile cozum
		int arr1[][] = { {1, 2}, {3}, {4, 5, 6}};
		
		int x= 1;
		for(int[] w: arr1) {
			for(int z: w) {
				x= x*z;
			}
		}
		System.out.println(x);
		
		

	}

}
