class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        String prev = "";
        String sub = "";
        // 이전 문자열 추출
        for(int i = 0; i < s; i++){
            char c = my_string.charAt(i);
            prev += c;
        }
        
        for(int i = s+overwrite_string.length(); i < my_string.length(); i++){
            char c = my_string.charAt(i);
            sub += c;
        }
        
        answer = prev + overwrite_string + sub;
        return answer;
    }
}