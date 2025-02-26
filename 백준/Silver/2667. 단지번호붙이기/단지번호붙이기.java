import java.io.*;
import java.util.*;

public class Main {

    static int[] dx = {-1, 1, 0, 0}; // 상 하 좌 우
    static int[] dy = {0, 0, -1, 1};

    static int N; // N : 지도의 크기
    static int[][] map;
    static int[][] visited;
    static String str;
    static int count; // 단지 수
    static ArrayList<Integer> houseCount = new ArrayList<>();


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        visited = new int[N][N];

        for(int i = 0; i < N; i++){
            str = br.readLine();
            for(int j = 0; j < N; j++){
                map[i][j] = str.charAt(j) - '0';
            }
        }

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if(map[i][j] == 1 && visited[i][j] == 0){
                    count++;
                    int houses = bfs(i,j);
                    houseCount.add(houses);
                }
            }
        }
        System.out.println(count);

        Collections.sort(houseCount);
        for(int houses : houseCount){
            System.out.println(houses);
        }
    }

    public static int bfs(int x, int y) {
        int houseCount = 0;
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {x,y});
        visited[x][y] = 1;

        while(!queue.isEmpty()){
            int[] current = queue.poll();
            int cx = current[0];
            int cy = current[1];
            houseCount++;

            for(int i = 0; i < 4; i++){
                int nx = cx + dx[i];
                int ny = cy + dy[i];
                if(nx < 0 || ny < 0 || nx >= N || ny >= N){
                    continue;
                }
                if(visited[nx][ny] == 1 || map[nx][ny] == 0){
                    continue;
                }
                queue.offer(new int[] {nx, ny});
                visited[nx][ny] = 1;
            }
        }
        return houseCount;
    }
}
