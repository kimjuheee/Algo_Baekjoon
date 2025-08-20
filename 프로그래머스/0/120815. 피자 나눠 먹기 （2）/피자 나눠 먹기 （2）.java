class Solution {
    public int solution(int n) {
        int answer = 0;
        int i = 1;
        while(6*i % n != 0){
            i++;
        }
        answer = i;
        return answer;
    }
}