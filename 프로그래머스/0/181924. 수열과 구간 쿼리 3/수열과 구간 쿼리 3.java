class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        
        for(int i = 0; i < queries.length; i++){
            int first = queries[i][0];
            int second = queries[i][1];
            
            int temp = 0;
            temp = arr[first];
            arr[first] = arr[second];
            arr[second] = temp;
        }
        return arr;
    }
}