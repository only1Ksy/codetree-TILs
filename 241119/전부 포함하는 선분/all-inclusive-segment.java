import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int[] x1 = new int[n];
        int[] x2 = new int[n];
        int minX1 = Integer.MAX_VALUE;
        int maxX2 = Integer.MIN_VALUE;
        int x1idx = 0;
        int x2idx = 0;

        for (int i = 0; i < n; i++){
            x1[i] = input.nextInt();
            x2[i] = input.nextInt();

            if (x1[i] < minX1){
                minX1 = x1[i]; x1idx = i;
            } if (x2[i] > maxX2){
                maxX2 = x2[i]; x2idx = i;
            }
        }

        int result1 = 0, result2 = 0;

        minX1 = Integer.MAX_VALUE;
        maxX2 = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++){
            if (i == x1idx) continue;

            minX1 = Math.min(x1[i], minX1);
            maxX2 = Math.max(x2[i], maxX2);
        }
        result1 = maxX2 - minX1;

        minX1 = Integer.MAX_VALUE;
        maxX2 = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++){
            if (i == x2idx) continue;

            minX1 = Math.min(x1[i], minX1);
            maxX2 = Math.max(x2[i], maxX2);
        }
        result2 = maxX2 - minX1;

        System.out.println(Math.min(result1, result2));
    }
}