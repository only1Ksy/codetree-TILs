import java.util.*;

public class Main {
    public static boolean inRange(int x, int y, int n) {
        return (0 <= x && x < n && 0 <= y && y < n);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] dx = new int[]{0, 1,  0, -1};
        int[] dy = new int[]{1, 0, -1,  0};

        int n = input.nextInt();
        int [][] arr = new int [n][n];

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                arr[i][j] = input.nextInt();
            }
        }
        
        int sum = 0;

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                int cnt = 0;

                for(int dirNum = 0; dirNum < 4; dirNum++) {
                    int nx = i + dx[dirNum], ny = j + dy[dirNum];
                    if(inRange(nx, ny, n) && arr[nx][ny] == 1)
                        cnt++;
                }

                if (cnt > 2)
                    sum++;
            }
        }

        System.out.println(sum);
    }
}

//행, 열의 상하좌우 확인 시에도 동일하게 dx, dy 테크닉 사용
//행, 열을 x, y로 두었다는 사실에 유의하여 +/- 작성
//배열의 경우 주어진 배열 크기를 초과하면 runtime error 발생
//따라서 배열 크기에 맞는지 확인하는 함수인 inRange를 사용하여 boolean값 반환 필요