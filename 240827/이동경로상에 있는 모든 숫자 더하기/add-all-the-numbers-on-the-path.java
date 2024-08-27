import java.util.*;

public class Main {
    public static boolean inRange(int x, int y, int n){
        return (x >= 0 && x < n && y >= 0 && y < n);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //방향 정의하기 (dx, dy 테크닉)
        //아 왼 위 오
        int[] dx = new int[]{1,  0, -1, 0};
        int[] dy = new int[]{0, -1,  0, 1};

        int dirNum = 2;

        int n = input.nextInt();
        int x = n/2;
        int y = n/2;
        int nx = n/2;
        int ny = n/2;

        int t = input.nextInt();

        int [][] arr = new int[n][n];

        String s = input.next();

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                arr[i][j] = input.nextInt();
            }
        }

        int sum = arr[x][y];

        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == 'L'){
                //반시계 방향으로의 회전
                dirNum = (dirNum + 3) % 4;
            }
            else if (s.charAt(i) == 'R'){
                //시계 방향으로의 회전
                dirNum = (dirNum + 1) % 4;
            }
            else {
                nx += dx[dirNum];
                ny += dy[dirNum];

                //범위 내에 들어와야만, 해당 칸 더하고 x, y 이동
                if (inRange(nx, ny, n)){
                    sum += arr[nx][ny];
                    x = nx; y = ny;
                }
                //범위 내에 들어오지 않는 경우 원상복귀
                else{
                    nx -= dx[dirNum]; ny -= dy[dirNum];
                }
            }
        }

        System.out.println(sum);
    }
}