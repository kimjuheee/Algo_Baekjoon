import java.io.*;
import java.util.*;

public class Main {

    static int[] dx = {-1, 1, 0, 0}; // 상 하 좌 우
    static int[] dy = {0, 0, -1, 1};

    static int N; // N : 열
    static int M; // M : 행
    static int[][] map;
    static int[][] visited;
    static String str;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new int[N][M];
        visited = new int[N][M];

        for(int i = 0; i < N; i++){
            str = br.readLine();
            for(int j = 0; j < M; j++){
                map[i][j] = str.charAt(j)- '0';
            }
        }
        System.out.println(bfs(0,0));
    }

    public static int bfs(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {x,y});
        visited[x][y] = 1;

        while(!queue.isEmpty()){
            int[] current = queue.poll();
            int cx = current[0];
            int cy = current[1];

            if(cx == N - 1 && cy == M - 1){
                return visited[cx][cy];
            }

            for(int i = 0; i < 4; i++){
                int nx = cx + dx[i];
                int ny = cy + dy[i];

                if(nx < 0 || ny < 0 || nx >= N || ny >= M){
                    continue;
                }
                if(map[nx][ny] == 0 || visited[nx][ny] != 0){
                    continue;
                }
                queue.offer(new int[]{nx,ny});
                visited[nx][ny] = visited[cx][cy] + 1;
            }
        }
        return -1;
    }
}