class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = {};
        // 오른쪽으로 회전하는 경우
        if(direction.equals("right")){
            int temp = numbers[numbers.length - 1];
            for(int i = numbers.length - 1; i > 0; i--){
                numbers[i] = numbers[i - 1];
            }
            numbers[0] = temp;
        }
        // 왼쪽으로 회전하는 경우
        else{
            int temp = numbers[0];
            for(int i = 1; i < numbers.length; i++){
                numbers[i - 1] = numbers[i];
            }
            numbers[numbers.length - 1] = temp;
        }
        return numbers;
    }
}