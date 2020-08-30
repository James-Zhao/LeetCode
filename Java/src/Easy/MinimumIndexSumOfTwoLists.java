package Easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by zhaosi on 17-6-20.
 * NO.599
 */
public class MinimumIndexSumOfTwoLists {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap<>();
        List<String> list = new ArrayList();
        int minIndex = Integer.MAX_VALUE;
        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }
        for (int i = 0; i < list2.length; i++) {
            if (map.containsKey(list2[i])) {
                if (i + map.get(list2[i]) == minIndex) {
                    list.add(list2[i]);
                }
                if (i + map.get(list2[i]) < minIndex) {
                    list = new ArrayList<>();
                    list.add(list2[i]);
                    minIndex = i + map.get(list2[i]);
                }
            }
        }
        return list.toArray(new String[list.size()]);
    }
}
