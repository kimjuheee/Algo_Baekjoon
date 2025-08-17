class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = true;
        boolean x1x2 = x1 || x2;
        boolean x3x4 = x3 || x4;
        answer = x1x2 && x3x4;
        return answer;
    }
}