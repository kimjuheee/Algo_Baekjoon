class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        boolean answer = false;
        int ans = 1;
        if(ineq.equals(">") && eq.equals("=")){
            answer = n >= m;
        }else if(ineq.equals("<") && eq.equals("=")){
            answer = n <= m;
        }else if(ineq.equals(">") && eq.equals("!")){
            answer = n > m;
        }else{
            answer = n < m;
        }
        return ans = (answer ==  true) ? 1 : 0;
    }
}