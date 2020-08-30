package Easy;

import java.util.ArrayList;
import java.util.List;

/**
 * NO.119
 */
public class PascalsTriangle2 {
    public List<Integer> getRow(int rowIndex) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i= 0;i <= rowIndex; i++)
        {
            result.add(0, 1);
            for (int j = 1; j < result.size() - 1; j++) {
                result.set(j, result.get(j) + result.get(j + 1));
            }
        }
        return result;
    }
}
