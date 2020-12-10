package Easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhaosi on 17-6-21.
 * NO.575
 */
public class DistributeCandies {
    public int distributeCandies(int[] candies) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < candies.length; i++) {
            if (map.containsKey(candies[i])) {
                map.put(candies[i], map.get(candies[i]) + 1);
            } else {
                map.put(candies[i], 1);
            }
        }
        if (candies.length / 2 < map.size()) {
            return candies.length / 2;
        } else {
            return map.size();
        }
    }
}
