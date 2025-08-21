class Solution {
    public int solution(int[] dot) {
        int answer = 0;
        int x = dot[0];
        int y = dot[1];
        // 1사분면
        if(x > 0 && y > 0){
            answer = 1;
        // 2사분면
        }else if(x < 0 && y > 0){
            answer = 2;
        // 3사분면
        }else if(x < 0 && y < 0){
            answer = 3;
        // 4사분면
        }else if(x > 0 && y < 0){
            answer = 4;
        }
        return answer;
    }
}