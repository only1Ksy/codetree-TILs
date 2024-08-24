import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // n: 행(row), m: 열(column) 입력 받기
        int n = input.nextInt();
        int m = input.nextInt();
        
        // n * m 크기의 2차원 배열 생성
        int[][] arr = new int[n][m];
        
        // 방향 배열: 아래, 오른쪽, 위쪽, 왼쪽
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};
        
        int x = 0, y = 0, dir = 0;  // 시작 위치와 초기 방향 설정
        for (int i = 1; i <= n * m; i++) {
            arr[x][y] = i;  // 현재 위치에 숫자 채우기
            
            // 다음 위치 계산
            int nx = x + dx[dir];
            int ny = y + dy[dir];
            
            // 다음 위치가 범위를 벗어나거나 이미 채워진 경우 방향 전환
            if (nx < 0 || nx >= n || ny < 0 || ny >= m || arr[nx][ny] != 0) {
                dir = (dir + 1) % 4;  // 다음 방향으로 전환
                nx = x + dx[dir];
                ny = y + dy[dir];
            }
            
            // 새 위치로 이동
            x = nx;
            y = ny;
        }
        
        // 결과 출력
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}