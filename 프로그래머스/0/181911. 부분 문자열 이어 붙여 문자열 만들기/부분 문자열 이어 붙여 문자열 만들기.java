class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        String answer = "";
        String str = "";
        for(int i = 0; i < parts.length; i++){
            int front = parts[i][0];
            int back = parts[i][1];
            
            for(int j = front; j <= back; j++){
                str += String.valueOf(my_strings[i].charAt(j));
            }
        }
        return str;
    }
}