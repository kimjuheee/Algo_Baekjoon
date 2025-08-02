class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String odd = "";
        String even = "";
        
        for(int i = 0; i < num_list.length; i++){
            // 짝수인 경우
            if(num_list[i] % 2 == 0) {
                even += Integer.toString(num_list[i]);
            }else{
                odd += Integer.toString(num_list[i]);
            }
        }
        
        answer = Integer.parseInt(even) + Integer.parseInt(odd);
        return answer;
    }
}