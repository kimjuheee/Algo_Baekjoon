import java.io.*;
import java.util.*;

public class Main {

    static int N; // 정점의 개수
    static int M; // 간선의 개수
    static int V; // 탐색을 시작할 정점의 번호
    static int[][] map;
    static int[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());
        map = new int[N+1][N+1];

        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int V1 = Integer.parseInt(st.nextToken());
            int V2 = Integer.parseInt(st.nextToken());

            map[V1][V2] = 1;
            map[V2][V1] = 1;
        }

        visited = new int[N + 1];
        dfs(V);
        System.out.println();
        visited = new int[N + 1];
        bfs(V);
    }

    public static void dfs(int v) {
        visited[v] = 1;
        System.out.print(v + " ");

        for(int i = 1; i <= N; i++){
            if(map[v][i] == 1 && visited[i] == 0){
                dfs(i);
            }
        }
    }

    public static void bfs(int v) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(v);
        visited[v] = 1;

        while(!queue.isEmpty()){
            int current = queue.poll();
            System.out.print(current + " ");

            for(int i = 1; i <= N; i++){
                if(map[current][i] == 1 && visited[i] == 0){
                    queue.offer(i);
                    visited[i] = 1;

                }
            }
        }
    }
}