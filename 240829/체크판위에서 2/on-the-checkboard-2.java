import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int r = input.nextInt();
        int c = input.nextInt();

        char [][] arr = new char[r][c];

        for (int i = 0; i < r; i++){
            for (int j = 0; j < c; j++)
                arr[i][j] = input.next().charAt(0);
        }

        int sum = 0;

        for (int i = 1; i < r-1; i++){
            for (int j= 1; j < c-1; j++){
                //i, j보다는 한 칸 오른쪽, 아래에 있어야 하므로 +1, 
                //마지막 칸보다는 한 칸 위, 왼쪽에 있어야 하므로 -1
                for (int k = i + 1; k < r-1; k++){
                    for (int l = j + 1; l < c-1; l++){
                        if (arr[0][0] != arr[i][j] && arr[i][j] != arr[k][l] && arr[k][l] != arr[r-1][c-1])
                            sum++;
                    }
                }
            }
        }

        System.out.println(sum);
    }
}