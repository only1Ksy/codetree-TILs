import java.util.Scanner;

public class Main {
    public static int[] A;

    public static int calcul(int a, int b){
        int sum = 0;

        for (int i = a-1; i < b; i++){
            sum += A[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int m = input.nextInt();

        String temp = input.nextLine();

        A = new int[n];
        int [][] arr = new int[m][2];

        for (int i = 0; i < n; i++){
            A[i] = input.nextInt();
        }
        temp = input.nextLine();

        for (int i = 0; i < m; i++){
            for (int j = 0; j < 2; j++){
                arr[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < m; i++){
            
            System.out.println(calcul(arr[i][0], arr[i][1]));

        }
    }
}