package Easy;

/**
 * Created by zhaosi on 17-6-21.
 */
public class RangeSumQuery {
    class NumArray {
        int[] sums;
        int[] nums;
        public NumArray(int[] nums) {
            if (nums.length != 0) {
                this.nums = nums;
                sums = new int[nums.length];
                sums[0] = nums[0];
                for (int i = 1; i < sums.length; i++) {
                    sums[i] = sums[i - 1] + nums[i];
                }
            }
        }

        public int sumRange(int i, int j) {
            return sums[j] - sums[i] + nums[i];
        }
    }
}
