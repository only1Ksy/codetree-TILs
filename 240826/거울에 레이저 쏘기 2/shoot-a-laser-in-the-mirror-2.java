import java.util.*;

public class Main {
    public static boolean inRange(int x, int y, int n) {
        // n은 배열의 크기, 인덱스는 0부터 n-1까지
        return x >= 0 && x < n && y >= 0 && y < n;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //상, 우, 하, 좌 (북, 동, 남, 서)
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};

        // n 입력, n 크기의 배열 생성
        int n = input.nextInt();
        char[][] arr = new char[n][n];

        // 맵의 정보
        for (int i = 0; i < n; i++) {
            String s = input.next();
            for (int j = 0; j < n; j++) {
                arr[i][j] = s.charAt(j);
            }
        }

        // k 입력
        int k = input.nextInt();

        int x = 0, y = 0, dirNum = 0;

        // 시작 위치 k에 따라 초기 좌표(x, y)와 방향(dirNum) 설정
        if (k <= n) {  // Top row, facing down
            x = 0;
            y = k - 1;
            dirNum = 2;  // 방향: 하 (남)
        } else if (k <= 2 * n) {  // Right column, facing left
            x = k - n - 1;
            y = n - 1;
            dirNum = 3;  // 방향: 좌 (서)
        } else if (k <= 3 * n) {  // Bottom row, facing up
            x = n - 1;
            y = 3 * n - k;
            dirNum = 0;  // 방향: 상 (북)
        } else {  // Left column, facing right
            x = 4 * n - k;
            y = 0;
            dirNum = 1;  // 방향: 우 (동)
        }

        //배열을 벗어날 때까지 이동시키고 count
        int cnt = 0;

        while (true) {
            cnt++;

            // 이동할 다음 위치
            int nx = x + dx[dirNum];
            int ny = y + dy[dirNum];

            // 다음 위치가 격자를 벗어나면 종료
            if (!inRange(nx, ny, n)) break;

            // 거울의 반사에 따른 방향 변경
            if (arr[nx][ny] == '/') {
                if (dirNum == 0) dirNum = 1;  // 북 -> 동
                else if (dirNum == 1) dirNum = 0;  // 동 -> 북
                else if (dirNum == 2) dirNum = 3;  // 남 -> 서
                else if (dirNum == 3) dirNum = 2;  // 서 -> 남
            } else if (arr[nx][ny] == '\\') {
                if (dirNum == 0) dirNum = 3;  // 북 -> 서
                else if (dirNum == 1) dirNum = 2;  // 동 -> 남
                else if (dirNum == 2) dirNum = 1;  // 남 -> 동
                else if (dirNum == 3) dirNum = 0;  // 서 -> 북
            }

            // 좌표 업데이트
            x = nx;
            y = ny;
        }

        System.out.println(cnt);
    }
}