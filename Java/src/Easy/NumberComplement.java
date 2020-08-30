package Easy;

/**
 * Created by zhaosi on 17-6-25.
 * NO.476
 */
public class NumberComplement {
    public int findComplement(int num) {
        int mask = 1, temp = num;
        while(temp > 0) {
            mask = mask << 1;
            temp = temp >> 1;
        }
        return num^(mask-1);
    }
}
