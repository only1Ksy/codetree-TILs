import java.util.*;

public class Main {
    public static boolean inRange(int x, int y, int n) {
        return (0 <= x && x < n && 0 <= y && y < n);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //왼 위 오 아 (하나 증가할 때마다 반시계방향으로 회전)
        int[] dx = { 0, -1,  0,  1};
        int[] dy = {-1,  0,  1,  0};

        int n = input.nextInt();

        int [][] arr = new int [n][n];

        int x = n-1, y = n-1;
        int dirNum = 0;
        arr[x][y] = n*n;

        //두 번째 칸 (0, 1)에 2부터 시작해서 넣어야 하므로 범위 설정
        for (int i = n*n - 1; i > 0; i--){
            int nx = x + dx[dirNum], ny = y + dy[dirNum];

            if(!inRange(nx, ny, n) || arr[nx][ny] != 0)
                dirNum = (dirNum + 1) % 4;

            //방향을 바꾼 다음 이동해야 하므로, x = nx가 아닌 새로운 dirNum 이용한 값 대입
            x += dx[dirNum]; y += dy[dirNum];

            arr[x][y] = i;
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }
}