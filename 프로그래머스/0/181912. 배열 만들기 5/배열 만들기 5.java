import java.util.*;

class Solution {
    public ArrayList solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        for(int i = 0; i < intStrs.length; i++){
            String str = "";
            str = intStrs[i];
            String num = "";
            num = str.substring(s, s+l);
            int number = Integer.parseInt(num);
            if(k < number){
                answer.add(number);
            }
        }
        return answer;
    }
}