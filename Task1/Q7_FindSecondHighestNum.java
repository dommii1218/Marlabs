package Task1;

public class Q7_FindSecondHighestNum {

	public static void main(String[] args) {
		int[] nums = {15, 3, 23, 1, 10};
		
		int maxNum = 0;
		for (int i=0; i<nums.length; i++) {
			int currNum = nums[i];
			if (currNum > maxNum) {
				maxNum = currNum;
			}
		}
		
		int secondMaxNum = 0;
		for (int i=0; i<nums.length; i++) {
			int currNum = nums[i];
			if (currNum > secondMaxNum && currNum < maxNum) {
				secondMaxNum = currNum;
			}
		}
		System.out.println("Second Highest Number is "+secondMaxNum);
	}

}
