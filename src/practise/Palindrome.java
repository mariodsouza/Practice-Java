package practise;

public class Palindrome {

	public static void main(String[] args) {
		String s = "2110112";
		String reverse="";
		for (int i=s.length()-1; i>=0; i--) {
			reverse=reverse+s.charAt(i);
		}
		System.out.println(reverse);
		if(s.equalsIgnoreCase(reverse)) 
			System.out.println("palindrome");
		else
			System.out.println("not palindrome");
		
		
	}

}
