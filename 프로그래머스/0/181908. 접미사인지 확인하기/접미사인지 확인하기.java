import java.util.*;

class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        ArrayList<String> list = new ArrayList<>();
        for(int i = my_string.length() - 1; i >= 0; i--){
            String str = my_string.substring(i);
            list.add(str);
            
            for(int j = 0; j < list.size(); j++){
                if(list.get(j).equals(is_suffix)){
                    answer = 1;
                    break;
                }
            }
        }
        return answer;
    }
}