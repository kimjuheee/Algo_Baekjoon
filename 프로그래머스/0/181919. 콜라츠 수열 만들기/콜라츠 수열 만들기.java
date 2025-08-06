import java.util.*;

class Solution {
    public ArrayList solution(int n) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        list.add(n);
        
        while(n != 1){
            if(n % 2 == 0){
                list.add(n/2);
                n = n/2;
            }else{
                list.add(3*n+1);
                n = 3*n+1;
            }
        }
        return list;
    }
}