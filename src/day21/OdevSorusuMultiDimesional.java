package day21;

public class OdevSorusuMultiDimesional {

	public static void main(String[] args) {
		//  A�a��daki multi dimensional array�in i� array�lerindeki son elemanlar�n �arp�m�n� ekrana yazd�ran 
		//bir program yaz�n�z { {1,2,3}, {4,5}, {6} }
		
		int arr[][]= { {1,2,3}, {4,5}, {6} };
		
		int t1=arr[0][2]=3;
		int t2=arr[1][1]=5;
		int t3=arr[2][0]=6;
		
		System.out.println(t1*t2*t3);
		
		
		int product= 1;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				product= product*arr[i][j];
				
			}
		}
		System.out.println(arr[0][2]*arr[1][1]*arr[2][0]);
		
		

	}

}
