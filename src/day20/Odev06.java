package day20;

public class Odev06 {
	
	public static void main(String [] args) {
		
		int x[] = {2,1,4,5,7};
		int limit=3;
		int i=0;
		int sum= 0;
		while((sum<limit) && (i<x.length)) {
			i++;
			sum= sum+x[i];
		}
		System.out.println(sum);
		
	}

}
