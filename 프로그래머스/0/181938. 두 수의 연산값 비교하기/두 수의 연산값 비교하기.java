class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int temp = 0;
        
        String str1 = Integer.toString(a);
        String str2 = Integer.toString(b);
        
        int num1 = Integer.parseInt(str1+str2);
        int num2 = 2*a*b;
        
        if(num1 > num2){
            answer = num1;
        }else{
            answer = num2;
        }
        
        return answer;
    }
}