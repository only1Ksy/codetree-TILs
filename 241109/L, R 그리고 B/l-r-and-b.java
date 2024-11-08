import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Point {
    int x, y, distance;

    public Point(int x, int y, int distance) {
        this.x = x;
        this.y = y;
        this.distance = distance;
    }
}

public class Main {
    static char[][] grid = new char[10][10];
    static boolean[][] visited = new boolean[10][10];
    static int[] dx = {-1, 1, 0, 0}; // 상, 하, 좌, 우 방향
    static int[] dy = {0, 0, -1, 1};
    static int lx, ly, bx, by; // L과 B 위치 저장

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 격자 입력과 L, B 위치 찾기
        for (int i = 0; i < 10; i++) {
            String line = sc.next();
            for (int j = 0; j < 10; j++) {
                grid[i][j] = line.charAt(j);
                if (grid[i][j] == 'L') {
                    lx = i;
                    ly = j;
                } else if (grid[i][j] == 'B') {
                    bx = i;
                    by = j;
                }
            }
        }

        // BFS 탐색 시작
        int result = bfs();
        System.out.println(result-1);
    }

    public static int bfs() {
        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(lx, ly, 0)); // L의 위치에서 시작
        visited[lx][ly] = true;

        while (!queue.isEmpty()) {
            Point current = queue.poll();

            // B에 도달했을 때 거리 반환
            if (current.x == bx && current.y == by) {
                return current.distance;
            }

            // 네 방향으로 이동
            for (int i = 0; i < 4; i++) {
                int nx = current.x + dx[i];
                int ny = current.y + dy[i];

                // 범위 내에 있고, 방문하지 않았으며 R이 아닌 경우에만 이동
                if (nx >= 0 && nx < 10 && ny >= 0 && ny < 10 && !visited[nx][ny] && grid[nx][ny] != 'R') {
                    visited[nx][ny] = true; // 방문 체크
                    queue.add(new Point(nx, ny, current.distance + 1));
                }
            }
        }

        return -1; // B에 도달할 수 없는 경우
    }
}