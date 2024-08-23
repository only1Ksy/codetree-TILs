import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //서, 남, 동, 북 (+: 반시계 / -: 시계)
        int [] dx = {-1,  0,  1,  0};
        int [] dy = { 0, -1,  0,  1};
        int x = 0, y = 0;

        String s = input.next();

        int returnTime = 0;
        int dirNum = 3; //북 방향에서 시작

        for (int i = 0; i < s.length(); i++){
            returnTime++;

            char c = s.charAt(i);

            if (c == 'L'){ //반시계방향 90도 회전
                dirNum = (dirNum + 1) % 4;
            }
            else if (c == 'R'){ //시계방향 90도 회전
                dirNum = (dirNum - 1 + 4) % 4;
            }
            else { //앞으로 한 칸 전진
                x += dx[dirNum];
                y += dy[dirNum];
            }     

            if (x == 0 && y == 0)
                break;       
        }

        System.out.println((x == 0 && y == 0) ? returnTime : -1);
    }
}