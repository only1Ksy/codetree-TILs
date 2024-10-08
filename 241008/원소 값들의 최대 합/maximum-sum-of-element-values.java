import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt(); // 원소 개수
        int m = input.nextInt(); // 움직일 횟수
        int[] arr = new int[n];  // 원소 배열

        for (int i = 0; i < n; i++){
            arr[i] = input.nextInt(); // 주어지는 숫자는 index + 1
        }

        int max = 0;

        // 시작 위치를 선정
        for (int i = 0; i < n; i++){
            int index = arr[i] - 1;
            int sum = 0;

            // m회 반복
            for (int j = 0; j < m; j++){
                sum += arr[index];
                index = arr[index] - 1;
            }

            max = Math.max(max, sum);
        }

        System.out.println(max);
    }
}