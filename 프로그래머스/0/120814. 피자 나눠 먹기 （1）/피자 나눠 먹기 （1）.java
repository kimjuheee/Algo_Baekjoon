class Solution {
    public int solution(int n) {
        int answer = 0;
        int num = n / 7;
        int remain = n % 7;
        if(remain > 0){
            num++;
        }
        answer = num;
        return answer;
    }
}