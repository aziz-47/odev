package day21;

public class Odev01MuiltiDimesional {

	public static void main(String[] args) {
		//  A�a��daki multi dimensional array�in tum elemanlar�n�n �arp�m�n� ekrana yazd�ran bir program yaz�n�z. 
		//{ {1,2,3}, {4,5,6} }  
		
		
		int arr[][]= { {1,2,3}, {4,5,6} };
		
		int product= 1;
		
		for(int i= 0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				product= product*arr[i][j];
			}
		}
		
		System.out.println("Tum characterlerin carpimi: " + product);
		
	}

}
