package day22;

public class Tekrar04 {

	public static void main(String[] args) {
		// //{ {1, 2}, {5}, {6, 7, 8} } array'indeki tum elemanlarin toplamini bulunuz
		
		
		int arr[][]= { {1, 2}, {5}, {6, 7, 8} };
		
		int sum1= 0;
		for(int[] w: arr) {
			for( int z: w) {
				sum1= sum1+ z;
			}
			
		}
		System.out.println(sum1);

	}

}
