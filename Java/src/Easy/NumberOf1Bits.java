package Easy;

/**
 * Created by zhaosi on 17-6-20.
 */
public class NumberOf1Bits {
    public int hammingWeight(int n) {
        int num = 0;
        while (n != 0) {
           n = n & (n-1);
           num++;
        }
        return num;
    }
}
