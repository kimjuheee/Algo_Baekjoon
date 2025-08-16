import java.util.*;

class Solution {
    public ArrayList solution(int[] arr, int[][] queries) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        for(int i = 0; i < queries.length; i++){
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];
            
            int min = Integer.MAX_VALUE;
            
            for(int j = s; j <= e; j++){
                if(k < arr[j] && min > arr[j]){
                    min = arr[j];
                }
            }
            
            if(min == Integer.MAX_VALUE){
                answer.add(-1);
            }else{
                answer.add(min);
            }
        }
        return answer;
    }
}