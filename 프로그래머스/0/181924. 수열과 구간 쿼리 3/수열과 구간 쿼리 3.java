import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        ArrayList<int[]> list = new ArrayList<>();
            
        // queries의 n번째 배열의 i,j 값 가져오기
        for(int i = 0; i < queries.length; i++){
            answer = queries[i];
            int x = answer[0];
            int y = answer[1];
            
            // arr 순서 바꾸기
            int temp = arr[x];
            arr[x] = arr[y];
            arr[y] = temp;
        }
        
        return arr;
    }
}