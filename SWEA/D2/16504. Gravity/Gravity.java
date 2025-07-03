import java.io.*;
import java.util.*;

class Solution{

    static int N; // 가로 길이
    static int[] rooms; // 상자 수

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine()); // 테케 수
        for(int tc = 1; tc <= T; tc++) {
            N = Integer.parseInt(br.readLine()); // 가로 길이 입력
            rooms = new int[N];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                rooms[i] = Integer.parseInt(st.nextToken());
            }

            // 낙차 계산 로직
            int maxDrop = 0;
            for(int i = 0; i < N-1; i++){
                int drop = 0;
                for(int j = i+1; j < N; j++){
                    if(rooms[i] > rooms[j]){
                        drop++;
                    }
                }
                maxDrop = Math.max(maxDrop, drop);
            }
            System.out.println("#"+tc+" "+maxDrop);
        }
    }
}