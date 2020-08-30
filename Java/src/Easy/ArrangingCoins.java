package Easy;

/**
 * NO.441
 */
public class ArrangingCoins {
    public int arrangeCoins(int n) {
        long nLong = (long)n;
        long start = 0;
        long end = nLong;
        long mid = 0;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (mid * (mid + 1) <= 2 * nLong) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return (int)start - 1;
    }
}
