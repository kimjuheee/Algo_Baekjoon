class Solution {
    public int solution(int hp) {
        int answer = 0;
        if(hp % 5 == 0){
            return answer = hp / 5;
        }else{
            answer += hp / 5;
            hp = hp % 5;
        }
        
        if(hp % 3 == 0){
            return answer += hp / 3;
        }else{
            answer += hp / 3;
            hp = hp % 3;
        }
        
        if(hp % 1 == 0){
            return answer += hp / 1;
        }
        return answer;
    }
}