import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int [] arr = new int[n];

        for (int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }

        int cnt = 1;  // 첫 번째 숫자를 포함하여 1부터 시작
        int max = 1;  // 최소 연속 길이는 1

        for(int i = 1; i < n; i++) {  // 두 번째 요소부터 시작
            if(arr[i] > arr[i - 1]){
                cnt++;
            }
            else{
                if (cnt > max){
                    max = cnt;
                }
                cnt = 1;  // 새 숫자가 나오면 cnt를 1로 초기화
            }
        }

        // 루프가 끝난 후 마지막으로 갱신되지 않았을 수 있는 max 값 확인
        if (cnt > max){
            max = cnt;
        }

        System.out.print(max);
    }
}