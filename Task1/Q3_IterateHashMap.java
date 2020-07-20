package Task1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Q3_IterateHashMap {

	public static void main(String[] args) {
		String str = "This is a test case case case";
		Q2_CountNumOfWords q2 = new Q2_CountNumOfWords();
		HashMap<String, Integer> map = q2.countNumOfWords(str);
		
		//While Loop
		System.out.println("While Loop:");
		Iterator<Entry<String, Integer>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry me = (Map.Entry) iterator.next();
			System.out.println(me.getKey()+" "+me.getValue());
		}
		
		//Advance For Loop
		System.out.println("For Loop:");
		for (Entry<String, Integer> me: map.entrySet()) {
			System.out.println(me.getKey() +" "+me.getValue());
		}
	}

}
