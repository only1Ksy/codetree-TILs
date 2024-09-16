import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int [] a = new int[n];
        int [] b = new int[n];

        for (int i = 0; i < n; i++){
            a[i] = input.nextInt();
            b[i] = input.nextInt();
        }
        
        int max = 0;

        // 해고할 사람 1명 선택
        for (int i = 0; i < n; i++) {
            int[] arr = new int[1001];  // 매번 새로운 배열로 초기화
            
            // i 번째 개발자를 제외하고 운행 시간을 계산
            for (int j = 0; j < n; j++) {
                if (i == j) continue;  // 한 명 제외

                for (int k = a[j]; k < b[j]; k++) {
                    arr[k] += 1;
                }
            }

            // 운행 시간을 계산
            int cnt = 0;
            for (int k = 0; k < 1001; k++) {
                if (arr[k] != 0) cnt++;
            }

            // 최대 운행 시간 갱신
            max = Math.max(max, cnt);
        }

        System.out.println(max);
    }
}