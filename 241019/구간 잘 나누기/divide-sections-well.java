import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int m = input.nextInt();

        int[] arr = new int[n];
        int sum = 0;
        int max = 0;

        for (int i = 0; i < n; i++){
            arr[i] = input.nextInt();
            sum += arr[i];
            max = Math.max(max, arr[i]);
        }

        int result = 0;

        for (int i = sum; i >= max; i--){
            int currentMax = i;
            int tempSum = 0;
            int cnt = 0;

            for (int j = 0; j < n; j++){
                int sumforCk = tempSum + arr[j];

                // 구간의 합이 max 값을 초과하면
                if (sumforCk > currentMax) {
                    cnt++; // 칸막이 설치
                    tempSum = arr[j]; // 확인용 구간합 초기화
                } // 그렇지 않으면
                else {
                    tempSum += arr[j]; // 구간합에 더하기
                }
            }

            // cnt는 칸막이 개수, m은 구간의 수이므로 < 로 설정!
            if (cnt < m){
                result = currentMax;
            } else {
                break;
            }
        }

        System.out.println(result);
    }
}