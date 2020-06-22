package day22;

import java.util.ArrayList;
import java.util.List;

public class Tekarar03 {

	public static void main(String[] args) {
		// Integer elemanlar iceren bir list olusturun.For each loop kullanarak
		//bu elemanlarin toplamini ekrana yazdirin.
		
		
		List<Integer>list= new ArrayList<>();
		
		list.add(120);
		list.add(130);
		list.add(140);
		System.out.println(list);
		
		int sum= 0;
		
		for(int w: list) {
			sum= sum+ w;
			
		}System.out.println(sum);
		

	}

}
