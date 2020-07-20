package Task1;

import java.util.ArrayList;

public class Q5_IterateArrayList {

	public static void main(String[] args) {
		ArrayList<String> fruitList = new ArrayList<String>();
		fruitList.add("Apple");
		fruitList.add("Banana");
		fruitList.add("Pear");
		fruitList.add("Mango");
		
		//For Loop
		System.out.println("For Loop:");
		for (int i=0; i<fruitList.size(); i++) {
			System.out.println(fruitList.get(i));
		}
		
		//While Loop
		System.out.println("while Loop:");
		int i=0;
		while (i<fruitList.size()) {
			System.out.println(fruitList.get(i));
			i++;
		}
		
		//Advance For Loop
		System.out.println("For Loop:");
		for (String s:fruitList) {
			System.out.println(s);
		}
	}

}
