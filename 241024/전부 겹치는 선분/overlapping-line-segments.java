import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] x1 = new int[n];
        int[] x2 = new int[n];
        int min = Integer.MAX_VALUE;
        int max = 0;

        for (int i = 0; i < n; i++){
            x1[i] = input.nextInt();
            x2[i] = input.nextInt();
            min = Math.min(min, x1[i]);
            max = Math.max(x2[i], max);
        }

        boolean isTrue = true;

        for (int i = min; i <= max; i++){
            isTrue = true;
            for (int j = 0; j < n; j++){
                if (i < x1[j] || i > x2[j])
                    isTrue = false;
            }

            if (isTrue){
                break;
            }
        }

        System.out.println(isTrue ? "Yes" : "No");
    }
}