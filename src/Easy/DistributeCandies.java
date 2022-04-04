package Easy;

import java.util.HashSet;

/**
 * Created by zhaosi on 17-6-21.
 * NO.575
 */
public class DistributeCandies {
    public int distributeCandies(int[] candies) {
        HashSet < Integer > set = new HashSet< >();
        for (int candy: candies) {
            set.add(candy);
        }
        return Math.min(set.size(), candies.length / 2);
    }
}
