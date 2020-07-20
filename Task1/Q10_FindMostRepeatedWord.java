package Task1;

import java.util.ArrayList;
import java.util.HashMap;

public class Q10_FindMostRepeatedWord {
	
	public ArrayList<String> findMostRepeatedWord(String str) {
		Q2_CountNumOfWords q2 = new Q2_CountNumOfWords();
		HashMap<String, Integer> map = q2.countNumOfWords(str);
		ArrayList<String> ans = new ArrayList<String>();
		int maxFreq = 0;
		for (String s: map.keySet()) {
			int freq = map.get(s);
			if (freq > maxFreq) {
				maxFreq = freq;
			}
		}
		
		for (String s: map.keySet()) {
			if (map.get(s) == maxFreq) {
				ans.add(s);
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		String str = "This is a test case this is a test case case case";
		Q10_FindMostRepeatedWord q10 = new Q10_FindMostRepeatedWord();
		System.out.println("Most Repeated word: ");
		ArrayList<String> ans = q10.findMostRepeatedWord(str);
		for (String s: ans) {
			System.out.print(s+" ");
		}
	}

}
