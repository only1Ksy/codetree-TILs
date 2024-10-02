import java.util.*;

public class Main {
    public static final int INT_MAX = Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }

        int min = INT_MAX;

        for (int i = 0; i < n; i++){
            arr[i] *= 2;

            for (int j = 0; j < n; j++){
                int[] copyArr = new int[n-1];
                int index = 0;
                int sum = 0;

                for (int k = 0; k < n; k++)
                    if (k != j) copyArr[index++] = arr[k];
                
                for (int k = 0; k < n-2; k++)
                    sum += Math.abs(copyArr[k] - copyArr[k+1]);

                min = Math.min(min, sum);   
            }

            arr[i] /= 2;
        }

        System.out.println(min);
    }
}