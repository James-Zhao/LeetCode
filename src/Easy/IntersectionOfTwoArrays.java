package Easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by zhaosi on 17-6-25.
 * NO.349
 */
public class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            map.put(nums1[i], 1);
        }
        for (int i = 0; i < nums2.length; i++) {
            if (map.containsKey(nums2[i])) {
                set.add(nums2[i]);
            }
        }
        int[] result = new int[set.size()];
        int i = 0;
        for (Integer integer: set) {
            result[i] = integer;
            i++;
        }
        return result;
    }
}
