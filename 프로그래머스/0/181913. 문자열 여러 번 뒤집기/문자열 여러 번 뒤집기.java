class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = my_string;
        for(int i = 0; i < queries.length; i++){
            // String answer = "";
            int s = queries[i][0];
            int e = queries[i][1];
            
            String before = answer.substring(0, s);
            String middle = answer.substring(s, e+1);
            String after = answer.substring(e+1);
            
            StringBuilder sb = new StringBuilder(middle);
            String reversed = sb.reverse().toString();
            
            answer = before + reversed + after;
            
        }
        return answer;
    }
}