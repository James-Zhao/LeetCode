package Easy;

import java.util.List;

/**
 * Created by zhaosi on 17-6-20.
 */
public class MaximumDistanceInArrays {
    public int maxDistance(List<List<Integer>> arrays) {
        int res = 0;
        int min = arrays.get(0).get(0);
        int max = arrays.get(0).get(arrays.get(0).size() - 1);
        for (int i = 1; i < arrays.size(); i++) {
            List<Integer> array = arrays.get(i);
            res = Math.max(Math.abs(min - array.get(array.size() - 1)), Math.max(Math.abs(array.get(0) - max), res));
            min = Math.min(min, array.get(0));
            max = Math.max(max, array.get(array.size() - 1));
        }
        return res;
    }
}
