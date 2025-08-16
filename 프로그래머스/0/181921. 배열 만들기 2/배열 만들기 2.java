import java.util.*;

class Solution {
    public ArrayList solution(int l, int r) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        for(int i = l; i <= r; i++){
            String str = String.valueOf(i);
            boolean flag = true;
            for(int j = 0; j < str.length(); j++){
                if(str.charAt(j) != '5' && str.charAt(j) != '0'){
                    flag = false;
                    break;
                }
            }
            if(flag == true){
                answer.add(Integer.parseInt(str));
            }
            
        }
        if(answer.isEmpty()){
            answer.add(-1);
        }
        return answer;
    }
}