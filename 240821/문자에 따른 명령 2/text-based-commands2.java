import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //방향 정의하기 (dx, dy 테크닉)
        int[] dx = new int[]{1,  0, -1, 0};
        int[] dy = new int[]{0, -1,  0, 1};

        int dirNum = 3;
        int nx = 0;
        int ny = 0;

        String s = input.next();

        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == 'L'){
                //반시계 방향으로의 회전
                //: -1을 하면 되지만 0의 경우 -1을 했을 때 4가 되어야 하므로
                dirNum = (dirNum - 1 + 4) % 4;
            }
            else if (s.charAt(i) == 'R'){
                //시계 방향으로의 회전
                //: 3의 경우 +1을 했을 때 0이 되어야 하므로
                dirNum = (dirNum + 1) % 4;
            }
            else {
                nx += dx[dirNum];
                ny += dy[dirNum];
            }
        }

        System.out.println(nx + " " + ny);
    }
}