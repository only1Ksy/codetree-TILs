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
                    int val = 0;

                    // 세 점이 수직으로 교차하는지 확인 (직교 여부)
                    if (x[i] == x[j] && y[i] == y[k]){
                        int base = Math.abs(x[i] - x[k]);
                        int height = Math.abs(y[j] - y[i]);

                        val = base * height;
                    }
                    else if (x[i] == x[j] && y[j] == y[k]){
                        int base = Math.abs(x[j] - x[k]);
                        int height = Math.abs(y[j] - y[i]);

                        val = base * height;
                    }
                    else if (x[i] == x[k] && y[i] == y[j]){
                        int base = Math.abs(x[j] - x[i]);
                        int height = Math.abs(y[i] - y[k]);

                        val = base * height;
                    }
                    else if (x[i] == x[k] && y[k] == y[j]){
                        int base = Math.abs(x[k] - x[j]);
                        int height = Math.abs(y[i] - y[k]);

                        val = base * height;
                    }
                    else if (x[j] == x[k] && y[j] == y[i]){
                        int base = Math.abs(x[j] - x[i]);
                        int height = Math.abs(y[j] - y[k]);

                        val = base * height;
                    }
                    else if (x[j] == x[k] && y[k] == y[i]){
                        int base = Math.abs(x[k] - x[i]);
                        int height = Math.abs(y[j] - y[k]);

                        val = base * height;
                    }

                    max = Math.max(max, val);
                }
            }
        }

        System.out.println(max);
    }
}