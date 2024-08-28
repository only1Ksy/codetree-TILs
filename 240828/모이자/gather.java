import java.util.*;

public class Main {
    public static final int INT_MIN = Integer.MIN_VALUE;
    public static final int INT_MAX = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        int [] arr = new int[n];

        for (int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }

        int minVal = INT_MAX;

        for (int i = 0; i < n; i++){
            int sum = 0;

            for (int j = 0; j < i; j++){
                sum += arr[j] * (i - j);
            }
            for (int j = i+1; j < n; j++){
                sum += arr[j] * (j - i);
            }

            minVal = Math.min(minVal, sum);
        }

        System.out.println(minVal);

    }
}