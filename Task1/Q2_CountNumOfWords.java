package Task1;

import java.util.HashMap;
import java.util.Map.Entry;

public class Q2_CountNumOfWords {
	
	public HashMap<String, Integer> countNumOfWords(String str){
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (String s:str.split("\\s+")) {
			if (!map.containsKey(s)) {
				map.put(s, 1);
			}
			else {
				map.put(s, map.get(s)+1);
			}
		}
		return map;
	}
	
	public static void main(String[] args) {
		String str = "This is a test case case case";
		Q2_CountNumOfWords q2 = new Q2_CountNumOfWords();
		HashMap<String, Integer> map = q2.countNumOfWords(str);
		for (Entry<String, Integer> me: map.entrySet()) {
			System.out.println(me.getKey() +" "+me.getValue());
		}
	}
}
