import java.util.*;

public class Main {
    public static final int INT_MIN = Integer.MIN_VALUE;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int [][] arr = new int [n][n];

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++)
                arr[i][j] = input.nextInt();
        }

        int maxVal = INT_MIN;

        for (int i = 0; i < n; i++){  //행
            for (int j = 0; j < n-2; j++){//열
                int sum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2];

                maxVal = Math.max(maxVal, sum);
            }
        }

        System.out.println(maxVal);
    }
}