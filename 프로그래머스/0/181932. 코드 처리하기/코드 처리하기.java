class Solution {
    public String solution(String code) {
        String answer = "";
        int mode = 0;
        
        for(int i = 0; i < code.length(); i++){
            // mode가 0일 때
            if(mode == 0){
                // 1일 때
                if(code.charAt(i) == '1'){
                    mode = 1;
                // 1이 아닐 때
                }else{
                    if(i % 2 == 0){
                        answer += code.charAt(i);
                    }
                }
            // mode가 1일 때
            }else{
                // 1일 때
                if(code.charAt(i) == '1'){
                    mode = 0;
                // 1이 아닐 때
                }else{
                    if(i % 2 == 1){
                        answer += code.charAt(i);
                    }
                }
            }
        }
        
        if(answer.length() == 0){
            answer = "EMPTY";
        }
        
        return answer;
    }
}