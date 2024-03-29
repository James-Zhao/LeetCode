package Medium;

/**
 * Created by zhaosi on 17-6-25.
 * NO.371
 */
public class SumOfTwoIntegers {
    public int getSum(int a, int b) {
        while(b != 0)
        {
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }
        return a;
    }
}
