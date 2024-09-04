import java.util.*;

public class Main {
    public static final int INT_MIN = Integer.MIN_VALUE;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int [] arr = new int[n];
        int k = input.nextInt();

        int max = INT_MIN;

        for (int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }

        for (int i = 0; i <= n-k; i++){
            int sum = 0;

            for (int j = 0; j < k; j++){
                sum += arr[i + j];
            }

            max = Math.max(max, sum);
        }

        System.out.println(max);
    }
}