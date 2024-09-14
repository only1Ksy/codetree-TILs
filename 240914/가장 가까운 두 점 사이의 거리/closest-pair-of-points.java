import java.util.*;

public class Main {
    public static final int INT_MAX = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int [] x = new int[n];
        int [] y = new int[n];

        for (int i = 0; i < n; i++){
            x[i] = input.nextInt();
            y[i] = input.nextInt();
        }

        int min = INT_MAX;

        for (int i = 0; i < n; i++){
            for (int j = i + 1; j < n; j++){
                int val = (int)(Math.pow(x[i] - x[j], 2) + Math.pow(y[i] - y[j], 2));

                min = Math.min(min, val);
            }
        }

        System.out.println(min);
    }
}