package Easy;

/**
 * Created by zhaosi on 17-6-20.
 * NO.66
 */
public class PlusOne {
    public int[] plusOne(int[] digits) {
        int length = digits.length;
        for (int i = length - 1; i >=0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            else {
                digits[i] = 0;
            }
        }
        int[] newDigits = new int[length+1];
        newDigits[0] = 1;
        return newDigits;
    }
}
