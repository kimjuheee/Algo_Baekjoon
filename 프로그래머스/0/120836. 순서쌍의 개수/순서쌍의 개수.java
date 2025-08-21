class Solution {
    public int solution(int n) {
        int answer = 0;
        int i = n;
        while(i > 0){
            if(n % i == 0){
                answer++;
            }
            i--;
        }
        return answer;
    }
}