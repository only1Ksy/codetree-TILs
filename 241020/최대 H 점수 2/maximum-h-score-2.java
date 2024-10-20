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

        // 앞에서부터 작은 요소에 1씩 더해주기
        for (int i = 0; i < l; i++){
            arr[i] += 1;
        }


        int result = 0;

        // h값을 기준으로 반복문 설정
        for (int i = max; i > -1; i--){
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