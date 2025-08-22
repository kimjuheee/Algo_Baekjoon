import java.util.*;

class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] str = letter.split(" ");
        for(int i = 0; i < str.length; i++){
            if(str[i].equals(".-")){
                answer += "a";
            }else if(str[i].equals("-...")){
                answer += "b";
            }else if(str[i].equals("-.-.")){
                answer += "c";
            }else if(str[i].equals("-..")){
                answer += "d";
            }else if(str[i].equals(".")){
                answer += "e";
            }else if(str[i].equals("..-.")){
                answer += "f";
            }else if(str[i].equals("--.")){
                answer += "g";
            }else if(str[i].equals("....")){
                answer += "h";
            }else if(str[i].equals("..")){
                answer += "i";
            }else if(str[i].equals(".---")){
                answer += "j";
            }else if(str[i].equals("-.-")){
                answer += "k";
            }else if(str[i].equals(".-..")){
                answer += "l";
            }else if(str[i].equals("--")){
                answer += "m";
            }else if(str[i].equals("-.")){
                answer += "n";
            }else if(str[i].equals("---")){
                answer += "o";
            }else if(str[i].equals(".--.")){
                answer += "p";
            }else if(str[i].equals("--.-")){
                answer += "q";
            }else if(str[i].equals(".-.")){
                answer += "r";
            }else if(str[i].equals("...")){
                answer += "s";
            }else if(str[i].equals("-")){
                answer += "t";
            }else if(str[i].equals("..-")){
                answer += "u";
            }else if(str[i].equals("...-")){
                answer += "v";
            }else if(str[i].equals(".--")){
                answer += "w";
            }else if(str[i].equals("-..-")){
                answer += "x";
            }else if(str[i].equals("-.--")){
                answer += "y";
            }else if(str[i].equals("--..")){
                answer += "z";
            }
        }
        return answer;
    }
}