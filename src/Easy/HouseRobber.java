package Easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhaosi on 17-6-21.
 * NO.198
 */
public class HouseRobber {
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        List<Integer> list = new ArrayList<>();
        list.add(nums[0]);
        list.add(nums[0] > nums[1]?nums[0]:nums[1]);
        for (int i = 2; i < nums.length; i++) {
            list.add(i, Math.max(list.get(i - 2) + nums[i], list.get(i - 1)));
        }
        return list.get(list.size() - 1);
    }
}
