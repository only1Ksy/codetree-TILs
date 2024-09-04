import java.util.*;

public class Main {
    public static final int INT_MAX = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        int s = input.nextInt();

        int [] arr = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++){
            arr[i] = input.nextInt();
            sum += arr[i];
        }

        int minus = INT_MAX;

        for (int i = 0; i < n; i++){
            for (int j = i+1; j < n; j++){
                int result = sum - (arr[i] + arr[j]);
                int mm = Math.abs(result - s);

                minus = Math.min(minus, mm);
            }
        }

        System.out.println(minus);
    }
}