import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int [] arr = new int[n];

        for (int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }

        int [] sum = new int[100000];

        int k = 0;

        for (int i = 0; i < n-1; i++){
            for (int j = 0; j < n-1; j++){
                if (i - 1 == j || i + 1 == j) continue;

                sum[k++] = arr[i] + arr[j];
            }
        }

        int max = 0;

        for (int i = 0; i < 100000; i++){
            max = Math.max(max, sum[i]);
        }

        System.out.println(max);
    }
}