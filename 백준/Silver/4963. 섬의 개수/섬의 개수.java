import java.io.*;
import java.util.*;

public class Main {

    static int[] dx = {-1, 1, 0, 0, -1, -1, 1, 1};
    static int[] dy = {0, 0, -1, 1, -1, 1, -1, 1};

    static int w; // w : 너비
    static int h; // h : 높이
    static int[][] map;
    static int[][] visited;
    static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        while(true){
            st = new StringTokenizer(br.readLine());
            w = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());

            if(w == 0 && h == 0){
                break;
            }

            map = new int[h][w];
            visited = new int[h][w];
            count = 0;

            for(int i = 0; i < h; i++){
                st = new StringTokenizer(br.readLine());
                for(int j = 0; j < w; j++){
                    map[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            for(int i = 0; i < h; i++){
                for(int j = 0; j < w; j++){
                    if(map[i][j] == 1 && visited[i][j] == 0){
                        count++;
                        bfs(i,j);
                    }
                }
            }
            System.out.println(count);
        }
    }

    public static void bfs(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {x,y});
        visited[x][y] = 1;

        while(!queue.isEmpty()){
            int[] current = queue.poll();
            int cx = current[0];
            int cy = current[1];

            for(int i = 0; i < 8; i++){
                int nx = cx + dx[i];
                int ny = cy + dy[i];
                if(nx < 0 || ny < 0 || nx >= h || ny >= w) {
                    continue;
                }
                if(map[nx][ny] == 0 || visited[nx][ny] == 1){
                    continue;
                }
                queue.offer(new int[]{nx,ny});
                visited[nx][ny] = 1;
            }
        }
    }
}
