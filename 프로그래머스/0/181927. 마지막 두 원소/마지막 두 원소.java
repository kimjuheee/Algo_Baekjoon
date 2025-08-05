import java.util.*;
import java.io.*;

class Solution {
    public ArrayList solution(int[] num_list) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        for(int i = 0; i < num_list.length; i++){
            answer.add(num_list[i]);
        }

        // 마지막 원소가 그전 원소보다 큰 경우
        if(num_list[num_list.length-1] > num_list[num_list.length-2]){
            answer.add(num_list[num_list.length-1] - num_list[num_list.length-2]);
        // 마지막 원소가 그전 원소보다 크지 않은 경우    
        }else{
            answer.add(num_list[num_list.length-1]*2);
        }
        return answer;
    }
}