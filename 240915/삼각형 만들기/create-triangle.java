import java.util.*;

public class Main {
    public static final int INT_MAX = Integer.MAX_VALUE;
    public static final int INT_MIN = Integer.MIN_VALUE;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];

        for (int i = 0; i < n; i++){
            x[i] = input.nextInt();
            y[i] = input.nextInt();
        }

        int max = 0;

        for (int i = 0; i < n; i++){
            for (int j = i + 1; j < n; j++){
                for (int k = j + 1; k < n; k++){
                    // 세 점이 수직으로 교차하는지 확인 (직교)
                    if ((x[i] == x[j] && y[i] == y[k]) || (x[i] == x[k] && y[i] == y[j]) || (x[j] == x[k] && y[j] == y[i])){
                        int minX = Math.min(x[i], Math.min(x[j], x[k]));
                        int maxX = Math.max(x[i], Math.max(x[j], x[k]));
                        int minY = Math.min(y[i], Math.min(y[j], y[k]));
                        int maxY = Math.max(y[i], Math.max(y[j], y[k]));

                        int val = (maxX - minX) * (maxY - minY);

                        max = Math.max(max, val);
                    }
                }
            }
        }

        System.out.println(max);
    }
}