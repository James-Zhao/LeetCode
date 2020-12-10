package Easy;

/**
 * Created by zhaosi on 17-6-19.
 * NO.7
 */
public class ReverseInteger {
    public int reverse(int x) {
        if (x >= Integer.MAX_VALUE || x <= Integer.MIN_VALUE) {
            return 0;
        }
        StringBuffer sb;
        long result;
        if (x > 0) {
            sb = new StringBuffer(String.valueOf(x));
            result = Long.parseLong(sb.reverse().toString());
            return result > Integer.MAX_VALUE?0:(int)result;
        }
        else {
            System.out.println(Math.abs(x));
            sb = new StringBuffer(String.valueOf((long)Math.abs(x)));
            result = Long.parseLong(sb.reverse().toString());
            return result > Integer.MAX_VALUE?0:-1*(int)result;
        }
    }
}
