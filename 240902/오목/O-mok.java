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

        int result = 0;
        int col = 0; int row = 0;

        //1) 가로 확인   (1*5)
        for (int i = 0; i < 19; i++){
            for (int j = 2; j < 19-2; j++){
                if (arr[i][j-2] == 1 && arr[i][j-1] == 1 && arr[i][j] == 1 && arr[i][j+1] == 1 && arr[i][j+2] == 1){
                    result = 1;
                    col = i; row = j;
                }
                if (arr[i][j-2] == 0 && arr[i][j-1] == 0 && arr[i][j] == 0 && arr[i][j+1] == 0 && arr[i][j+2] == 0){
                    result = 0;
                    col = i; row = j;
                }
            }
        }

        //2) 세로 확인   (5*1)
        for (int i = 0; i < 19; i++){
            for (int j = 2; j < 19-2; j++){
                if (arr[j-2][i] == 1 && arr[j-1][i] == 1 && arr[j][i] == 1 && arr[j+1][i] == 1 && arr[j+2][i] == 1){
                    result = 1;
                    col = j; row = i;
                }
                if (arr[j-2][i] == 0 && arr[j-1][i] == 0 && arr[j][i] == 0 && arr[j+1][i] == 0 && arr[j+2][i] == 0){
                    result = 0;
                    col = j; row = i;
                }
            }
        }

        //3) 대각선 확인 (왼->오)
        for (int i = 0; i < 19; i++){
            for (int j = 0; j < 19; j++){
                int x1 = i-1; int y1 = j-1;
                int x2 = i-2; int y2 = j-2;
                int x3 = i+1; int y3 = j+1;
                int x4 = i+2; int y4 = j+2;

                if (inRange(x1, y1) && inRange(x2, y2) && inRange(x3, y3) && inRange(x4, y4)){
                    if (arr[x1][y1] == arr[x2][y2] && arr[x2][y2] == arr[i][j] && arr[i][j] == arr[x3][y3] && arr[x3][y3] == arr[x4][y4]){
                        result = arr[i][j];
                        col = i; row = j;
                    }
                }
            }
        }

        //4) 대각선 확인 2 (오->왼)
        for (int i = 0; i < 19; i++){
            for (int j = 0; j < 19; j++){
                int x1 = i-1; int y1 = j+1;
                int x2 = i-2; int y2 = j+2;
                int x3 = i+1; int y3 = j-1;
                int x4 = i+2; int y4 = j-2;

                if (inRange(x1, y1) && inRange(x2, y2) && inRange(x3, y3) && inRange(x4, y4)){
                    if (arr[x1][y1] == arr[x2][y2] && arr[x2][y2] == arr[i][j] && arr[i][j] == arr[x3][y3] && arr[x3][y3] == arr[x4][y4]){
                        result = arr[i][j];
                        col = i; row = j;
                    }
                }
            }
        }

        System.out.println(result);
        System.out.println(col + " " + row);
    }
}