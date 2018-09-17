package Easy;

import java.util.Arrays;

/**
 * Created by zhaosi on 17-6-19.
 */
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        if (nums.length == 1 || nums == null) {
            return false;
        }
        java.util.Set<Integer> set = new java.util.HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        return set.size() != nums.length;
    }
}
