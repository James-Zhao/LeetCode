package Easy;

/**
 * Created by zhaosi on 17-6-19.
 * NO.268
 */
public class MissingNumber {
    public int missingNumber(int[] nums) {
        int result = 0;
        int i;
        for (i = 0; i < nums.length; i++) {
            result ^= i;
            result ^= nums[i];
        }
        return result ^ nums.length;
    }
}
