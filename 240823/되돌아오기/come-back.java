import java.util.*;

public class Main {
    public static int Dir(char c) {
        if (c == 'W')
            return 0;
        else if (c == 'S')
            return 1;
        else if (c == 'N')
            return 2;
        else
            return 3;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //서, 남, 북, 동
        int [] dx = {-1,  0,  0,  1};
        int [] dy = { 0, -1,  1,  0};
        int x = 0, y = 0;

        int n = input.nextInt();

        int returnTime = 0;

        for (int i = 0; i < n; i++){
            int dirNum = Dir(input.next().charAt(0));
            int moveLength = input.nextInt();

            //moveLength초 동안 dirNum 방향으로 x, y 1초에 한 칸씩 옮기기
            for (int j = 0; j < moveLength; j++){
                returnTime++;

                x += dx[dirNum];
                y += dy[dirNum];
                
                if (x == 0 && y == 0)
                    break;
            }

            if (x == 0 && y == 0)
                break;
        }

        System.out.println((x == 0 && y == 0) ? returnTime : -1);
    }
}