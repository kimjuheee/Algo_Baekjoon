import java.util.*;

class Solution {
    public ArrayList solution(int money) {
        ArrayList<Integer> list = new ArrayList<>();
        int num = money / 5500;
        list.add(num);
        int coin = money % 5500;
        list.add(coin);
        return list;
    }
}