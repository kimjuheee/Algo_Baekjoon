import java.util.*;
import java.io.*;

class Solution {
    public String solution(int[] numLog) {

        ArrayList<String> answer = new ArrayList<>();
        String str = "";
        
        for(int i = 0; i < numLog.length -1; i++){
            if(numLog[i+1] - numLog[i] == 1){
                answer.add("w");
            }else if(numLog[i+1] - numLog[i] == -1){
                answer.add("s");
            }else if(numLog[i+1] - numLog[i] == 10){
                answer.add("d");
            }else{
                answer.add("a");
            }
        }
        for(int i = 0; i < answer.size(); i++){
            str += answer.get(i);
        }
        return str;
    }
}