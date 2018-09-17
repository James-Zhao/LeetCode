package Easy;

/**
 * Created by zhaosi on 17-6-21.
 */
public class ClimbingStairs {
    public int climbStairs(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (n == 2) return 2;
        int[] counts = new int[n+1];
        counts[0] = 0;
        counts[1] = 1;
        counts[2] = 2;
        for (int i = 3; i <= n; i++) {
            counts[i] = counts[i - 1] + counts[i - 2];
        }
        return counts[n];
    }
}
