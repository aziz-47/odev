package day22;

import java.util.ArrayList;
import java.util.List;

public class OdevSorusu02 {

	public static void main(String[] args) {
		// Bir integer list olu�turunuz ve bu list�deki tum say�lar�n karesinin toplam�n� 
		//For-each loop kullanarak bulunuz. Sonucu ekrana yazd�r�n�z.
		
		List<Integer> list= new ArrayList<>();
		
		list.add(8);
		list.add(10);
		list.add(12);
		list.add(5);
		System.out.println(list);
		
		int sum= 0;
		
		for( int w: list) {
			sum=sum+ (w*w);
		}
		System.out.println(sum);


	}

}
