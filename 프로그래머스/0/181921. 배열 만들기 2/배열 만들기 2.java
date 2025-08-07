import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int l, int r) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = l; i <= r; i++) {
            String s = String.valueOf(i);
            boolean onlyZeroAndFive = true;

            for (char c : s.toCharArray()) {
                if (c != '0' && c != '5') {
                    onlyZeroAndFive = false;
                    break;
                }
            }

            if (onlyZeroAndFive) {
                list.add(i);
            }
        }

        if (list.isEmpty()) {
            list.add(-1);
        }

        return list;
    }
}