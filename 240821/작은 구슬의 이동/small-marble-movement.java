import java.util.*;

public class Main {
    public static int getDir(char a) {
        if(a == 'R')
            return 0;
        else if(a == 'D')
            return 1;
        else if(a == 'U')
            return 2;
        else
            return 3;
    }

    public static boolean inRange(int x, int y, int n) {
        return (0 <= x && x < n && 0 <= y && y < n);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //0번과 3번이 반대 방향이 되도록
        //1번과 2번이 반대 방향이 되도록 dx, dy를 설정
        int[] dx = new int[]{0, 1, -1,  0};
        int[] dy = new int[]{1, 0,  0, -1};

        int n = input.nextInt();
        int t = input.nextInt();
        int [][] arr = new int [n][n];

        //구슬의 초기 정보
        int r = input.nextInt() - 1;
        int c = input.nextInt() - 1;
        int dirNum = getDir(input.next().charAt(0));

        //t초 동안 구슬의 움직임
        for (int i = 0; i < t; i++){
            //벽을 만났는지 확인용 (미리 움직여 보기)
            int nx = r + dx[dirNum], ny = c + dy[dirNum];

            //벽을 만난 경우 방향 전환
            if(!inRange(nx, ny, n)) {    
                dirNum = 3 - dirNum;
            }
            else {
                //움직이기
                r = nx;
                c = ny;
            }
        }

        System.out.println((r + 1) + " " + (c + 1));
    }
}