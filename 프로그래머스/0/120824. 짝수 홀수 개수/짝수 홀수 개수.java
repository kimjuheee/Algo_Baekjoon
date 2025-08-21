import java.util.*;

class Solution {
    public ArrayList solution(int[] num_list) {
        ArrayList<Integer> list = new ArrayList<>();
        int even = 0;
        int odd = 0;
        for(int i = 0; i < num_list.length; i++){
            // 짝수인 경우
            if(num_list[i] % 2 == 0){
                even++;
            }else{
                odd++;
            }
        }
        list.add(even);
        list.add(odd);
        return list;
    }
}