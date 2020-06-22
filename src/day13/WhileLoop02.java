package day13;

public class WhileLoop02 {

	public static void main(String[] args) {
		// ilk 5 sayma sayisinin carpimini ekrana yazdiran programi yazniz
		
		int product=1;
		int num=1;
		while(num<6) {
			product= num*product;
			num++;
		}
		System.out.println(product );

	}

}
