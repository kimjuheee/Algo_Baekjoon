class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        // 모두 같은 경우
        if(a == b && a == c && a == d && b == c && b == d && c == d){
            answer = a*1111;
        }
        // 모두 다른 경우
        else if(a != b && a != c && a != d && b != c && b != d && c != d){
            answer = Math.min(Math.min(a,b), Math.min(c,d));
        }
        // 3개만 같은 경우
        else if(a == b && b == c && c == a && a != d){
            answer = (10*a+d)*(10*a+d);
        }
        else if(c == d && b == c && d == b && a != d){
            answer = (10*d+a)*(10*d+a);
        }
        else if(a == c && d == c && d == a && a != b){
            answer = (10*a+b)*(10*a+b);
        }
        else if(a == b && b == d && d == a && a != c){
            answer = (10*a+c)*(10*a+c);
        }
        // 2개 2개 같은 경우
        else if(a == b && c == d && a != c){
            answer = (a+c)*Math.abs(a-c);
        }
        else if(a == c && d == b && a != b){
            answer = (a+b)*Math.abs(a-b);
        }
        else if(a == d && b == c && a != b){
            answer = (a+b)*Math.abs(a-b);
        }
        // 2개 1개 1개 경우
        else if(a == b && a != c && a != d && c != d){
            answer = c*d;
        }
        else if(a == c && a != b && a != d && b != d){
            answer = b*d;
        }
        else if(a == d && a != b && a != c && b != c){
            answer = b*c;
        }
        else if(b == c && b != a && b != d && a != d){
            answer = a*d;
        }
        else if(b == d && b != a && b != c && a != c){
            answer = a*c;
        }
        else if(c == d && c != a && c != b && a != b){
            answer = a*b;
        }
        return answer;
    }
}