package Easy;

/**
 * Created by zhaosi on 17-6-19.
 * NO.168
 */
public class ExcelSheetColumnTitle {
    public String convertToTitle(int n) {
        StringBuffer sb = new StringBuffer();
        while (n > 0) {
            if (n % 26 == 0) {
                n = n / 26 - 1;
                sb.insert(0, 'Z');
            }else {
                sb.insert(0, (char) ('A' + n % 26 - 1));
                n = n / 26;
            }
        }
        return sb.toString();
    }
}
