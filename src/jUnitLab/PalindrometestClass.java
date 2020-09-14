package jUnitLab;

public class PalindrometestClass {
public String test(String s) {
		
		String reverse = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			reverse = reverse + s.charAt(i);
		}
		if (reverse.equals(s)) {
			System.out.println("The word " + s + " is a palindrome.");
		} else {
			System.out.println("The word " + s + " is a NOT palindrome.");
		}
		return reverse;
	}
}
