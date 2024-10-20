import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int l = input.nextInt();
        int max = 0;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++){
            arr[i] = input.nextInt();
            max = Math.max(max, arr[i]);
        }

        Arrays.sort(arr);


        int result = 0;

        // h값을 기준으로 반복문 설정
        for (int i = max; i > -1; i--){
            // h값에 가깝지만 작은 배열 요소에 1씩 더해주기
            // 1 2 3 100, i == 3, l == 1
            int cnt = 0;
            int startIdx = 0;
            for (int j = n-1; j > -1; j--){
                if (arr[j] < i) {
                    if (cnt == 0) {
                        startIdx = j;
                    }
                    arr[j] += 1;
                    cnt++;
                }
                if (cnt == l) break;
            }

            cnt = 0; // h 이상인 수의 개수

            for (int j = 0; j < n; j++){
                if (arr[j] >= i) cnt++;
            }

            if (cnt >= i){
                result = i;
                break;
            }

            // 배열 원상복귀
            for (int j = startIdx; j > startIdx-l; j--){
                arr[j] -= 1;
            }
        }

        

        System.out.println(result);
    }
}