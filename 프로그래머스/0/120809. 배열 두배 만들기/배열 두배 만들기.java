import java.util.*;

class Solution {
    public ArrayList solution(int[] numbers) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < numbers.length; i++){
            list.add(numbers[i]*2);
        }
        return list;
    }
}