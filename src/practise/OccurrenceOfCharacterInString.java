package practise;

import java.util.HashMap;
import java.util.Scanner;

public class OccurrenceOfCharacterInString {

	public static void main(String[] args) {
		System.out.println("Enter string");
//		String s = System.console().readLine();
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		getOccurrence(s);

	}
	
	public static void getOccurrence(String s) {
		HashMap<Character, Integer> charCount = new HashMap<Character, Integer>();
		
		for(int i=0; i<s.length(); i++) {
			char c = s.toUpperCase().charAt(i);
			if(charCount.containsKey(c)) {
				charCount.put(c, charCount.get(c)+1);
			}
			else {
				charCount.put(c, 1);
			}
		}
		System.out.println(charCount.entrySet());
		for (Character c : charCount.keySet()) {
			System.out.println(c + " : " + charCount.get(c));
		}
	}

}
