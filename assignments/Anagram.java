package week2.day4.assignments;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text1 = "stops";
		String text2 = "potss"; 
		if (text1.length()==text2.length()) {
			char[] charArray = text2.toCharArray();
			char[] charArray2 = text2.toCharArray();
			Arrays.sort(charArray);
			Arrays.sort(charArray2);
			boolean equals = Arrays.equals(charArray, charArray2);
			if (equals==true) {
				System.out.println("The two strings are an anagram");
				
			}
			else {
				System.out.println("The two strings are not  an anagram");
			}
		}
		
	}

}
