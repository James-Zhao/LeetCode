package Easy;

/**
 * Created by zhaosi on 17-6-19.
 */
public class FindTheDifference {
    public char findTheDifference(String s, String t) {
        String total = s + t;
        int c = 0;
        for (int i = 0; i < total.length(); i++) {
            c ^= total.charAt(i);
        }
        return (char)c;
    }
}
