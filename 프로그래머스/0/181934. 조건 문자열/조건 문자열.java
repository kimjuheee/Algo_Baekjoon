class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        boolean answer = false;
        int answer_num = 0;
        if(ineq.equals(">") && eq.equals("=")){
            answer = n >= m;
        }else if(ineq.equals("<") && eq.equals("=")){
            answer = n <= m;
        }else if(ineq.equals(">") && eq.equals("!")){
            answer = n > m;
        }else{
            answer = n < m;
        }
        
        if(answer == false){
            answer_num = 0;
        }else{
            answer_num = 1;
        }
        return answer_num;
    }
}