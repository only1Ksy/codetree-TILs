import java.util.*;

public class Main {
    public static boolean inRange(int x, int y, int n){
        if (x >= 0 && x < n && y >= 0 && y < n)
            return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //동, 서, 남, 북 순서
        int [] dx = { 1, -1,  0,  0};
        int [] dy = { 0,  0, -1,  1};

        //n*n의 격자 생성
        int n = input.nextInt();
        int [][] arr = new int [n][n];

        int m = input.nextInt();

        //색칠된 상태 1, 안 된 상태 0
        for (int i = 0; i < m; i++){
            int r = input.nextInt() - 1;
            int c = input.nextInt() - 1;
            //입력받은 칸 색칠하기
            arr[r][c] = 1;

            int cnt = 0;

            for (int j = 0; j < 4; j++){
                //각 방향으로 1씩 진행
                int nx = r + dx[j], ny = c + dy[j];

                if (inRange(nx, ny, n) && arr[nx][ny] == 1)
                    cnt++;
            }

            if (cnt == 3)
                System.out.println(1);
            else
                System.out.println(0);
        }
    }
}