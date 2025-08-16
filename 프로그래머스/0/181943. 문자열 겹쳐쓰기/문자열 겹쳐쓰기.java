class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        String str1 = "";
        String str2 = "";
        for(int i = 0; i < s; i++){
            char c = my_string.charAt(i);
            str1 += c;
        }
        
        for(int i = s+overwrite_string.length(); i < my_string.length(); i++){
            char c = my_string.charAt(i);
            str2 += c;
        }
        answer = str1 + overwrite_string + str2;
        return answer;
    }
}