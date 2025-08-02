class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        for(int i = 0; i < str1.length(); i++){
            char a = str1.charAt(i);
            answer += a;
            char b = str2.charAt(i);
            answer += b;
        }
        return answer;
    }
}