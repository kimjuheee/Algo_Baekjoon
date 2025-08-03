class Solution {
    public String solution(String code) {
        String answer = "";
        int mode = 0;
        
        for(int i = 0; i < code.length(); i++){
            // mode가 0일 때
            if(mode == 0){
                // code[i]가 1인 경우
                if(code.charAt(i) == '1'){
                    mode = 1;
                // code[i]가 1이 아닌 경우
                }else{
                    if(i % 2 == 0){
                        answer += code.charAt(i);
                    }
                }
            // mode가 1일 때
            }else{
                // code[i]가 1인 경우
                if(code.charAt(i) == '1'){
                    mode = 0;
                }else{
                    if(i % 2 == 1){
                        answer += code.charAt(i);
                    }
                }
            }
        }
        if(answer.isEmpty() == true){
            return "EMPTY";
        }else{
            return answer;
        }
    }
}