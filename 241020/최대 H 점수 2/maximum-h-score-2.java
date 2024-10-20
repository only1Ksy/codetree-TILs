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
            for (int j = Math.max(0, Math.min(i, n)) - l; j < l; j++){
                arr[j] += 1;
            }

            int cnt = 0; // h 이상인 수의 개수

            for (int j = 0; j < n; j++){
                if (arr[j] >= i) cnt++;
            }

            if (cnt >= i){
                result = i;
                break;
            }
        }

        System.out.println(result);
    }
}