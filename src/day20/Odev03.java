package day20;

import java.util.Arrays;

public class Odev03 {

	public static void main(String[] args) {
		int arr[]= {2,1,7,6};
		Arrays.sort(arr);
		for(int i= 0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		String str[] = {"Ali", "Ahmet", "Kemal", "Can"};
		Arrays.sort(str);
		for(int i=0; i<str.length; i++) {
			System.out.print(str[i] + " ");
		}
	}

}