package Easy;

/**
 * NO.717
 */
public class OneBitAndTwoBitCharacters {
    public boolean isOneBitCharacter(int[] bits) {
        int count = 0;
        for (int i = bits.length - 2; i >= 0 && bits[i] != 0; i--) {
            count++;
        }
        if (count % 2 != 0) {
            return false;
        }
        return true;
    }
}
