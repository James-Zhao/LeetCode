package Easy;

/**
 * Created by zhaosi on 17-6-20.
 */
public class ExcelSheetColumnNumber {
    public int titleToNumber(String s) {
        int total = 0;
        for (int i = 0; i < s.length(); i++) {
            total += (int)(s.charAt(i) - 'A' + 1) * (int)Math.pow(26, s.length() - i - 1);
        }
        return total;
    }
}
