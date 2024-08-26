import java.util.*;

public class Main {
    public static boolean inRange(int x, int y, int n){
        if (x < 0 || x >= n || y < 0|| y >= n)
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

        int dirNum = 0;

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

        while (inRange(x, y, n)) {
            cnt++;
            //상우하좌
            if (arr[x][y] == '/'){
                if (dirNum == 0 || dirNum == 2)
                    dirNum = (dirNum + 1) % 4;
                else if (dirNum == 1 || dirNum == 3)
                    dirNum = (dirNum + 3) % 4;
            }
            else if (arr[x][y] == '\\'){
                if (dirNum == 1 || dirNum == 3)
                    dirNum = (dirNum + 1) % 4;
                else if (dirNum == 0 || dirNum == 2)
                    dirNum = (dirNum + 3) % 4;
            }

            x += dx[dirNum]; y += dy[dirNum];
        }

        System.out.println(cnt);
    }
}