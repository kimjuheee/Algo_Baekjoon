class Solution {
    public String solution(int age) {
        String answer = "";
        String str = Integer.toString(age);
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if(c == '0'){
                answer += "a";
            }else if(c == '1'){
                answer += "b";
            }else if(c == '2'){
                answer += "c";
            }else if(c == '3'){
                answer += "d";
            }else if(c == '4'){
                answer += "e";
            }else if(c == '5'){
                answer += "f";
            }else if(c == '6'){
                answer += "g";
            }else if(c == '7'){
                answer += "h";
            }else if(c == '8'){
                answer += "i";
            }else{
                answer += "j";
            }
        }
        return answer;
    }
}