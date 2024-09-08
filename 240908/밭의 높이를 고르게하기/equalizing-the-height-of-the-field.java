import java.util.*;

public class Main {
    public static final int INT_MAX = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int h = input.nextInt();
        int t = input.nextInt();

        int [] arr = new int[n];

        for (int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }

        int min = INT_MAX;

        for (int i = 0; i < n-t; i++){
            int cnt = 0;

            for (int j = i; j < i + t; j++) {
                cnt += Math.abs(arr[j] - h);
            }

            min = Math.min(min, cnt);
        }

        System.out.println(min);
    }
}