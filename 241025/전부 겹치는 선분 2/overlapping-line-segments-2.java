import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] x1 = new int[n];
        int[] x2 = new int[n];
        int maxX1 = Integer.MIN_VALUE;
        int minX2 = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++){
            x1[i] = input.nextInt();
            x2[i] = input.nextInt();

            maxX1 = Math.max(maxX1, x1[i]);
            minX2 = Math.min(minX2, x2[i]);
        }

        int max2x1 = Integer.MIN_VALUE;
        int min2x2 = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++){
            if (x1[i] != maxX1) 
                max2x1 = Math.max(max2x1, x1[i]);
            if (x2[i] != minX2)
                min2x2 = Math.min(min2x2, x2[i]);
        }

        if (max2x1 > minX2 && maxX1 > min2x2) 
            System.out.println("No");
        else 
            System.out.println("Yes");
    }
}