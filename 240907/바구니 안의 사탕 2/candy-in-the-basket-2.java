import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int k = input.nextInt();

        int[] num = new int[n];
        int[] pla = new int[n];
        int[] arr = new int[100 + 1];

        for (int i = 0; i < n; i++) {
            num[i] = input.nextInt();
            pla[i] = input.nextInt();
            arr[pla[i]] += num[i];
        }

        int max = 0;

        // 중심점 c를 0부터 100까지 반복
        for (int i = 0; i <= 100; i++) {
            int sum = 0;

            // [i-k, i+k] 구간의 사탕 수 계산
            for (int j = Math.max(0, i - k); j <= Math.min(100, i + k); j++) {
                sum += arr[j];
            }

            max = Math.max(max, sum);
        }

        System.out.println(max);
    }
}