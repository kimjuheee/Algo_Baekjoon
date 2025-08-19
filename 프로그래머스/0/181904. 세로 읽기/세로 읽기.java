class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        
        for(int i = 0; i < my_string.length(); i+=m){
            String str = my_string.substring(i , i+m);
            for(int j = 0; j < str.length(); j++){
                if(j == c - 1){
                    answer += String.valueOf(str.charAt(j));
                }
            }
        }
        return answer;
    }
}