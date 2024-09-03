import java.util.*;

public class Main {
    public static boolean inRange(int x, int y, int n, int m) {
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

        // 모든 칸에 대해 검사
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                // 'L'과 'E' 모두 확인
                if (arr[i][j] == 'L' || arr[i][j] == 'E') {
                    for (int k = 0; k < 4; k++) {
                        int numE = 0;
                        int x = i;
                        int y = j;

                        // 'L' 혹은 'E' 기준으로 오른쪽 방향 확인
                        while (true) {
                            x += dx[k];
                            y += dy[k];

                            if (inRange(x, y, n, m) && arr[x][y] == 'E') {
                                numE++;
                            } else {
                                break;
                            }
                        }

                        // 만약 2개의 'E'가 발견되었을 경우
                        if (numE == 2) {
                            // 시작이 'L'이면 'LEE' 패턴
                            if (arr[i][j] == 'L') {
                                result++;
                            } 
                            // 시작이 'E'이면 왼쪽 방향으로 'L'을 찾기
                            else if (arr[i][j] == 'E') {
                                int xL = i - dx[k]; 
                                int yL = j - dy[k];

                                if (inRange(xL, yL, n, m) && arr[xL][yL] == 'L') {
                                    result++;
                                }
                            }
                        }
                    }
                }
            }
        }

        System.out.println(result);
    }
}