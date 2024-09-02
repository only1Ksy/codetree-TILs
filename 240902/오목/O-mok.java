import java.util.*;

public class Main {
    public static boolean inRange(int x, int y){
        return x >= 0 && x < 19 && y >= 0 && y < 19;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] arr = new int[19][19];

        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                arr[i][j] = input.nextInt();
            }
        }

        // 방향 벡터 설정: 가로, 세로, 대각선 (오른쪽 아래, 왼쪽 아래)
        int[] dx = {0, 1, 1, -1};
        int[] dy = {1, 0, 1, 1};

        int result = 0;
        int col = 0, row = 0;

        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                if (arr[i][j] != 0) {
                    int color = arr[i][j];

                    for (int k = 0; k < 4; k++) {
                        int cnt = 1;
                        int x = i;
                        int y = j;

                        // 다음 위치를 확인
                        while (true) {
                            x += dx[k];
                            y += dy[k];

                            if (inRange(x, y) && arr[x][y] == color) {
                                cnt++;
                            } else {
                                break;
                            }
                        }

                        // 다섯 개의 같은 색 바둑알이 연속될 경우
                        if (cnt == 5) {
                            result = color;
                            // 연속된 5개의 바둑알 중 가운데 바둑알의 위치
                            col = i + 2 * dx[k] + 1; //바둑알 좌표 1부터 시작
                            row = j + 2 * dy[k] + 1;
                            break;
                        }
                    }
                }
                if (result != 0) break;
            }
            if (result != 0) break;
        }

        System.out.println(result);
        if (result != 0) {
            System.out.println(col + " " + row);
        }
    }
}