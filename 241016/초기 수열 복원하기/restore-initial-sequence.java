import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n - 1];
        int[] result = new int[n];
        boolean found = false;

        for (int i = 0; i < n - 1; i++) {
            arr[i] = input.nextInt();
        }

        // 1부터 n까지 가능한 첫 번째 원소를 시도
        for (int start = 1; start <= n; start++) {
            boolean[] used = new boolean[n + 1];
            result[0] = start;
            used[start] = true;
            boolean valid = true;

            // 나머지 값들을 계산
            for (int i = 1; i < n; i++) {
                result[i] = arr[i - 1] - result[i - 1];

                // 1부터 n까지의 숫자만 사용 가능
                if (result[i] < 1 || result[i] > n || used[result[i]]) {
                    valid = false;
                    break;
                }
                used[result[i]] = true;
            }

            // 조건을 만족하는 수열을 찾으면 출력하고 종료
            if (valid) {
                for (int i = 0; i < n; i++) {
                    System.out.print(result[i] + " ");
                }
                found = true;
                break;
            }
        }
    }
}