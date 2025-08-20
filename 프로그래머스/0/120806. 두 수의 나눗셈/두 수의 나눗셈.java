class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        double num_1 = (double)num1;
        double num_2 = (double)num2;
        double num = num_1 / num_2;
        answer = (int)((num_1 / num_2) * 1000);
        return answer;
    }
}