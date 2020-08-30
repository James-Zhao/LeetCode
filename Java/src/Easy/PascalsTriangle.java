package Easy;

import java.util.ArrayList;
import java.util.List;

/**
 * NO.118
 */
public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
//        List<List<Integer>> result = new ArrayList<>();
//        if (numRows == 0) return result;
//        List<Integer> first = new ArrayList<>();
//        first.add(1);
//        result.add(first);
//        while (numRows > 1) {
//            List<Integer> element = generateNextRow(first);
//            result.add(element);
//            numRows--;
//            first = element;
//        }
//        return result;
        List<List<Integer>> allrows = new ArrayList<List<Integer>>();
        ArrayList<Integer> row = new ArrayList<Integer>();
        for(int i=0;i<numRows;i++)
        {
            row.add(0, 1);
            for(int j=1;j<row.size()-1;j++) {
                row.set(j, row.get(j) + row.get(j + 1));
            }
            allrows.add(new ArrayList<Integer>(row));
        }
        return allrows;
    }

//    private List<Integer> generateNextRow(List<Integer> list) {
//        List<Integer> result = new ArrayList<>();
//        for (int i = 0; i < list.size() + 1; i++) {
//            result.add(0);
//        }
//        result.set(0, list.get(0));
//        result.set(list.size(),list.get(list.size() - 1));
//        for (int i = 1; i < list.size(); i++) {
//            result.set(i, list.get(i - 1) + list.get(i));
//        }
//        return result;
//    }
}

