import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        int maxSum = 0;

        // 모든 가능한 쌍을 탐색하면서 인접한 경우를 제외합니다.
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (Math.abs(i - j) > 1) { // i와 j가 인접하지 않을 때만 고려
                    maxSum = Math.max(maxSum, arr[i] + arr[j]);
                }
            }
        }

        System.out.println(maxSum);
    }
}