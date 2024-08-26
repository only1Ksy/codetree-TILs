import java.util.*;

public class Main {
    public static boolean inRange(int x, int y, int n){
        if (x < 0 || x > n || y < 0|| y > n)
            return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //상, 우, 하, 좌
        int [] dx = {-1,  0,  1,  0};
        int [] dy = { 0,  1,  0, -1};

        //n 입력, n 크기의 배열 생성
        int n = input.nextInt();
        char [][] arr = new char[n][n];

        //맵의 정보
        for (int i = 0; i < n; i++){
            String s = input.next();

            for (int j = 0; j < s.length(); j++){
                arr[i][j] = s.charAt(j);
            }
        }

        //k 입력
        int k = input.nextInt();

        int x = 0;
        int y = 0;

        //초기 좌표 설정
        int [][] ary = new int[n][n];

        int num = 1; //오른쪽부터 시작

        ary[0][0] = 1;

        for (int i = 2; i < (n*4); i++){
            if (k == 1 || k == n*4)
                break;

            int nx = x + dx[num];
            int ny = y + dy[num];

            if (!inRange(nx, ny, n))
                num = (num - 1 + 4) % 4;
            
            x = x + dx[num];
            y = y + dy[num];
            ary[x][y] = i;

            if (ary[x][y] == k)
                break;
        }
        
        //초기 방향 설정
        int dirNum = 0;

        if (k > 0 && k <= n)
            dirNum = 2;
        else if (k > n && k <= n*2)
            dirNum = 3;
        else if (k > n*2 && k <= n*3)
            dirNum = 0;
        else
            dirNum = 1;

        //배열을 벗어날 때까지 이동시키고 count
        int cnt = 1;

        while (true) {
            cnt++;
            //상우하좌
            //방향 -1
            if ((arr[x][y] == '/' && (dirNum == 2 || dirNum == 0))||(arr[x][y] == '\\' && (dirNum == 3 || dirNum == 1))){
                dirNum = (dirNum - 1 + 4) % 4;

                int nx = x + dx[dirNum];
                int ny = y + dy[dirNum];

                if (!inRange(nx, ny, n))
                    break;
                else{
                    x = nx; y = ny;
                    continue;
                }
            }
            //방향 +1
            else if ((arr[x][y] == '/' && (dirNum == 3 || dirNum == 1))||(arr[x][y] == '\\' && (dirNum == 2 || dirNum == 0))){
                dirNum = (dirNum + 1) % 4;

                int nx = x + dx[dirNum];
                int ny = y + dy[dirNum];

                if (!inRange(nx, ny, n))
                    break;
                else{
                    x = nx; y = ny;
                    continue;
                }
            }
        }

        System.out.println(cnt);
    }
}

//진행 방향 + 거울의 방향에 따른 경우의 수
//4 * 2 = 8개