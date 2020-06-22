package day19;

public class Tekrar04 {

	public static void main(String[] args) {
		// // Elemanlri 1, 2, 3, 4, 5 olan bir int array olustrunuz
		// bu arrayda 3 elemaninin olup olmadigini kontrol ediniz
		// 3 varsa ekrana 3 var yazdirini. 3 yoksa ekrana 3 yok yazdirin
		// Kac tane 3 oldugunu da yazdirin
		
		
		//int arr1[]= new int[5];
		
//		 arr1[0]= 1;
//		 arr1[1]= 2;
//		 arr1[2]= 3;
//		 arr1[3]= 4;
//		 arr1[4]= 5;
		
		
		
		int arr1[]= {1,2,3,4,5, 3, 5, 6,3 };
		
		int count= 0;
		
		for(int i=0; i<9; i++) {
			if(arr1[i]==3) {
				count++;
			}
		}
		
		if(count>0) {
			System.out.println(count + " tane 3 var");
		}else {
			System.out.println("3 yok");
		}

	}

}
