package day22;

import java.util.ArrayList;
import java.util.List;

public class OdevSorusu02 {

	public static void main(String[] args) {
		// Bir integer list oluþturunuz ve bu list’deki tum sayýlarýn karesinin toplamýný 
		//For-each loop kullanarak bulunuz. Sonucu ekrana yazdýrýnýz.
		
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
