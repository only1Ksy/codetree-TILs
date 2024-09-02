import java.util.*;

public class Main {
    public static boolean inRange(int x, int y){
        if (x < 0 || x >= 19 || y < 0 || y >= 19)
            return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [][] arr = new int[19][19];

        for (int i = 0; i < 19; i++){
            for (int j = 0; j < 19; j++){
                arr[i][j] = input.nextInt();
            }
        }

        //dx, dy 테크닉 차용
        //가로/세로/오른쪽아래/왼쪽아래
        int [] dx = { 0,  1,  1, -1};
        int [] dy = { 1,  0,  1,  1};

        int dirNum = 0;
        int result = 0;
        int col = 0, row = 0;

        for (int i = 0; i < 19; i++){
            for (int j = 0; j < 19; j++){
                if (arr[i][j] != 0){
                    int cnt = 1; //이미 arr[i][j] 하나 카운트
                    int color = arr[i][j];
                    int x = i; int y = j;

                    for (int k = 0; k < 4; k++){
                        while (true){
                            x += dx[k]; 
                            y += dy[k];

                            if (inRange(x, y) && arr[x][y] == color){
                                cnt++;
                                dirNum = k;
                            } else{
                                break;
                            }
                        }
                    }
                

                    if (cnt == 5){
                        result = color;
                        col = i + 2*dx[dirNum];
                        row = j + 2*dy[dirNum];
                        break;
                    }
                }
            }
            if (cnt == 5) break;
        }

        System.out.println(result);
        System.out.println(col + " " + row);
    }
}