package Task1;

import java.util.ArrayList;
import java.util.HashSet;

public class Q9_FindMissingIntegers {

	public ArrayList<Integer> findMissingIntegers(int[] nums){
		ArrayList<Integer> ans = new ArrayList<Integer>();
		HashSet<Integer> set = new HashSet<Integer>();
		int min = 0, max = 0;
		for (int i=0; i<nums.length; i++) {
			int num = nums[i];
			if (!set.contains(num)) {
				set.add(num);
				if (num < min) {
					min = num;
				}
				if (num > max) {
					max = num;
				}
			}
		}
		
		for (int i=min+1; i<max; i++) {
			if (!set.contains(i)) {
				ans.add(i);
			}
		}
		return ans;
	}
	
	public static void main(String[] args) {
		int[] nums = {3,3,1,6,10,7,8,5,5,5};
		Q9_FindMissingIntegers q9 = new Q9_FindMissingIntegers();
		System.out.println(q9.findMissingIntegers(nums));
	}

}
