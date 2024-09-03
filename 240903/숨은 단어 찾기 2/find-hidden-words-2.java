import java.util.*;

public class Main {
    public static boolean inRange(int x, int y, int n, int m){
        return x >= 0 && x < n && y >= 0 && y < m;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int m = input.nextInt();
        input.nextLine();
        char[][] arr = new char[n][m];

        for (int i = 0; i < n; i++) {
            String s = input.nextLine();
            for (int j = 0; j < m; j++) {
                arr[i][j] = s.charAt(j);
            }
        }

        // 방향 벡터 설정: 가로, 세로, 대각선 (오른쪽 아래, 왼쪽 아래)
        int[] dx = {0, 1, 1, -1};
        int[] dy = {1, 0, 1, 1};

        int result = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 'L') {
                    for (int k = 0; k < 4; k++) {
                        int num = 0;
                        int x = i;
                        int y = j;

                        //기준점으로부터 오른쪽으로 전개되는 위치 확인
                        while (true) {
                            x += dx[k];
                            y += dy[k];

                            if (inRange(x, y, n, m) && arr[x][y] == 'E') {
                                num++;
                            } else {
                                break;
                            }
                        }

                        if (num >= 2) {
                            result++;
                        }

                        num = 0;
                        x = i;
                        y = j;

                        //기준점으로부터 왼쪽으로 전개되는 위치 확인
                        while (true) {
                            x -= dx[k];
                            y -= dy[k];

                            if (inRange(x, y, n, m) && arr[x][y] == 'E') {
                                num++;
                            } else {
                                break;
                            }
                        }

                        if (num >= 2) {
                            result++;
                        }
                    }
                }
            }
        }

        System.out.println(result);
    }
}