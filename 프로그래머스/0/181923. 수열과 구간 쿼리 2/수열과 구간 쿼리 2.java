import java.util.*;

class Solution {
    public ArrayList solution(int[] arr, int[][] queries) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < queries.length; i++){
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];
            
            int num = Integer.MAX_VALUE;
            
            for(int j = s; j <= e; j++){
                if(k < arr[j]){
                    num = Math.min(num, arr[j]);
                }
            }
            
            if(num == Integer.MAX_VALUE){
                list.add(-1);
            }else{
                list.add(num);
            }
        }
        return list;
    }
}