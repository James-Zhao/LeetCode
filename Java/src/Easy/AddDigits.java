package Easy;

/**
 * Created by zhaosi on 17-6-20.
 */
public class AddDigits {
    public int addDigits(int num) {
        if (num < 10) {
            return num;
        }
        int result = 0;
        while (num != 0) {
            result += num % 10;
            num = num / 10;
        }
        return addDigits(result);
    }
}
