package Task1;

public class Q1_ReverseString {
	
	public String reverseString(String str) {
		
		String ans = "";
		for (int i=str.length()-1; i>=0; i--) {
			ans += str.substring(i,i+1);
		}
		return ans;
	}

	public static void main(String[] args) {
		String str = "abcde";
		System.out.println(str);
		System.out.println("After reversion: ");
		Q1_ReverseString q1 = new Q1_ReverseString();
		System.out.println(q1.reverseString(str));
	}

}
