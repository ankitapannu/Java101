import java.util.*;

public class KidsCandies {
	public int findMaxValue (int[] nums) {
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<Boolean>();
        int max = findMaxValue(candies);
        for (int i = 0; i < candies.length; i++) {
            boolean b = (candies[i] + extraCandies >= max);
            result.add(b);
        }
        return result;
    }

}
