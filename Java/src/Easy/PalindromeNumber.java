package Easy;

/**
 * Created by zhaosi on 17-6-19.
 */
public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        StringBuffer sb = new StringBuffer(String.valueOf(x));
        StringBuffer tmp = new StringBuffer(String.valueOf(x)).reverse();
        return sb.toString().equals(tmp.toString());
    }
}
