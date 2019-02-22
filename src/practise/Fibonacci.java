package practise;

public class Fibonacci {

	public static void main(String[] args) {
		
		int no=12; //upto 10
		int a=0;
		int b=1;
		int c=1;
//		while(c<10) {
//			c=a+b;
//			System.out.println(c);
//			a=b;
//			b=c;
//		}
		System.out.println(c);
		for(int i=0; i<no-1; i++) {
			c=a+b;
			a=b;
			b=c;
			System.out.println(c);
		}
		

	}

}
