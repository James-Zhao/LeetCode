package Easy;

/**
 * Created by zhaosi on 17-6-19.
 * NO.242
 */
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s == null && t == null) {
            return true;
        }
        return sortString(s).equals(sortString(t));
    }

    public static String sortString(String s) {
        char[] array = s.toCharArray();
        java.util.Arrays.sort(array);
        return String.valueOf(array);
    }
}
