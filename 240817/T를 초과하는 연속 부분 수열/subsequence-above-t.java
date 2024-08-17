import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int t = input.nextInt();

        int [] arr = new int[n];

        for (int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }

        int cnt = 0;  // 0부터 시작
        int max = 0;  // 최소 연속 길이는 0

        for(int i = 0; i < n; i++) {  // 첫 번째 요소부터 시작
            if(arr[i] > t){
                cnt++;
            }
            else{
                if (cnt > max){
                    max = cnt;
                }
                cnt = 0;  // cnt를 0으로 초기화
            }
        }

        // 루프가 끝난 후 마지막으로 갱신되지 않았을 수 있는 max 값 확인
        if (cnt > max){
            max = cnt;
        }

        System.out.print(max);
    }
}