class Solution {
    public int solution(int n) {
        int answer = 0;
        // 홀수라면
        if(n % 2 == 1){
            for(int i = 1; i <= n; i++){
                if(i % 2 == 1){
                    answer += i;
                }
            }
        // 짝수라면
        }else{
            for(int i = 2; i <= n; i++){
                if(i % 2 == 0){
                    answer += i*i;
                }
            }
        }
        return answer;
    }
}