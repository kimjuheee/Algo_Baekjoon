import java.util.*;

class Solution {
    public ArrayList solution(String my_string) {
        String[] answer = {};
        ArrayList<String> list = new ArrayList<>();
        for(int i = my_string.length() - 1; i >= 0 ; i--){
            String str = "";
            str = my_string.substring(i);
            list.add(str);
        }
        Collections.sort(list);
        return list;
    }
}