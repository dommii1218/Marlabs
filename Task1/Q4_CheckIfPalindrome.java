package Task1;

public class Q4_CheckIfPalindrome {
	
	public boolean checkIfPalindrome(String str) {
		if (str.isEmpty() || str.length() == 0) return false;
		int left = 0;
		int right = str.length()-1;
		while (left <= right) {
			if (str.charAt(left) == str.charAt(right)) {
				left ++;
				right --;
			}
			else {
				return false;
			}
		}
		return true;
	}
	
	public boolean checkIfPalindrome(int num) {
		if (num >= 0) {
			int right = 0;
			int left = num;
			while (left>0) {
				right = right*10 + left%10;
				left = left/10;
			}
			return right == num ;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		Q4_CheckIfPalindrome q4 = new Q4_CheckIfPalindrome();
		System.out.println(q4.checkIfPalindrome("abcba"));
		System.out.println(q4.checkIfPalindrome("abccba"));
		System.out.println(q4.checkIfPalindrome("abcde"));
		System.out.println(q4.checkIfPalindrome(12321));
		System.out.println(q4.checkIfPalindrome(-12321));
	}
	
}
