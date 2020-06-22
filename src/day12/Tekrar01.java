package day12;

public class Tekrar01 {

	public static void main(String[] args) {
		// while loop kullanarak 1 den 10 a kadar tamsayilari ekrana yazdiriniz.
		
		int num1=1;
		while (num1<11) {
			System.out.print(num1+ " ");
			num1++;
		}
		System.out.println();
		
		//while loop kullanarak 1 den 20 ye kadar cift tamsayilari ekrana yazdiriniz.
		
		int num2=1;
		while(num2<21) {
			if(num2%2==0) {
				System.out.print(num2+ " ");
			}
			num2++;
		}
		
		
		//while loop kullanarak 5 den 120 ye kadar 3 ile bolunebilen tamsayilari yazdiriniz.
		
		int num3=5;
		while(num3<121) {
			if(num3%3==0) {
				System.out.print(num3+ " ");
			}
			num3++;
		}
		
				
		
		
		
		
		
		
				
	}

}
