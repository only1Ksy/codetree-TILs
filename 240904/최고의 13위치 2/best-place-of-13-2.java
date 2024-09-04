import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int [][] arr = new int[n][n];

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                arr[i][j] = input.nextInt();
            }
        }

        int num = 0;

        //첫번째 격자
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n-2; j++){
                //두번째 격자
                for (int k = 0; k < n; k++){
                    for (int l = 0; l < n-2; l++){
                        int sum = 0;

                        if (i != k || l > j+2 || l < j-2){
                            sum = arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[k][l] + arr[k][l+1] + arr[k][l+2];
                            num = Math.max(num, sum);
                        }
                    }
                }
            }
        }

        System.out.println(num);
    }
}