import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        HashSet<Integer> set = new HashSet<>();
        
        for(int num : nums){
            set.add(num);
        }
        
        int maxSelect = nums.length / 2;
        int type = set.size();
        return Math.min(maxSelect, type);
    }
}