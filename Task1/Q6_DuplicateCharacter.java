package Task1;

import java.util.HashSet;

public class Q6_DuplicateCharacter {
	
	public HashSet<Character> duplicateCharacters(String str){
		HashSet<Character> set = new HashSet<Character>();
		char[] charArr = str.toCharArray();
		for (int i = 0; i<str.length(); i++) {
			if (! set.contains(charArr[i]) && charArr[i] != ' ') {
				for (int j=i+1; j<str.length(); j++) {
					if (charArr[i] == charArr[j]) {
						set.add(charArr[j]);
						break;
					}
				}
			}
		}
		return set;
	}

	public static void main(String[] args) {
		String str = "It is a test case";
		System.out.println("The input string: "+str);
		System.out.println("Duplicate characters are: ");
		Q6_DuplicateCharacter q6 = new Q6_DuplicateCharacter();
		for (Character ch: q6.duplicateCharacters(str)) {
			System.out.print(ch+" ");
		}
	}
}
