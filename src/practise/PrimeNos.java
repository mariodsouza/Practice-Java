package practise;

public class PrimeNos {

	public static void main(String[] args) {
		int no=5;
		int flag=0;
		
		if(no==0||no==1) {
			System.out.println(no+" is not prime");
		}
		
		for (int i=2; i<no; i++) {
			if(no%i==0) {
				flag=1;
				break;
			}
		}
		if(flag==1)
		System.out.println(no+" is not prime");
		else
			System.out.println(no+" is prime");
	}

}
