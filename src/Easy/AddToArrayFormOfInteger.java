package Easy;

import java.util.ArrayList;
import java.util.List;

/**
 * NO.989
 */
public class AddToArrayFormOfInteger {
    public List<Integer> addToArrayForm(int[] A, int K) {
        List<Integer> result = new ArrayList<>();
        for (int i = A.length - 1; i >= 0 || K > 0 ; i--) {
            int carry = i >= 0? A[i] + K % 10: K;
            result.add(0, carry % 10);
            K = i >= 0? K / 10 + carry / 10: K / 10 + 0;
        }
        return result;
    }
}
