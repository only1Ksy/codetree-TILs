import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] arr = new int[2 * n];

        for (int i = 0; i < 2 * n; i++){
            arr[i] = input.nextInt();
        }

        Arrays.sort(arr);

        int result = Integer.MAX_VALUE;

        // 최대한 차이가 많이 나는 것들끼리 묶어야 함
        for (int i = 0; i < n; i++){
            int tempSum = arr[i + n] - arr[i];

            result = Math.min(result, tempSum);
        }

        System.out.println(result);
    }
}