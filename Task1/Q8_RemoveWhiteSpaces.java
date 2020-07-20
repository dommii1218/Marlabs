package Task1;

public class Q8_RemoveWhiteSpaces {
	
	public String removeWhiteSpaces(String str) {
		String ans = "";
		int i = 0;
		while (true) {
			int j = str.indexOf(" ", i);
			if (j == -1) break;
			
			ans += str.substring(i, j);
			
			i = j+1;
			while (i<str.length()) {
				if (str.charAt(i) == ' ') {
					i++;
				}
				else break;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		String str = "This   is  a   test       case";
		Q8_RemoveWhiteSpaces q8 = new Q8_RemoveWhiteSpaces();
		System.out.println(q8.removeWhiteSpaces(str));
	}

}
