class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        answer = 2*a*b;
        String str = Integer.toString(a) + Integer.toString(b);
        
        answer = Math.max(Integer.parseInt(str), answer);

        return answer;
    }
}