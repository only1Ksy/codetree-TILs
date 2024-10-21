import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int k = input.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }

        int minResult = Integer.MAX_VALUE;

        // 차이가 k인 구간을 설정, 해당 구간에 모두 들어오도록 만드는 계산 수행
        for (int i = 0; i < 10000-k; i++){
            int min = i;
            int max = i + k;
            int sum = 0; // 비용 계산

            for (int j = 0; j < n; j++){
                if (arr[j] < min){
                    sum += min-arr[j];
                }
                else if (arr[j] > max){
                    sum += arr[j] - max;
                }
            }

            minResult = Math.min(minResult, sum);
        }

        System.out.println(minResult);
    }
}