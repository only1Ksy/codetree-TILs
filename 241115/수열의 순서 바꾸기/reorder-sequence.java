import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 수열의 크기
        int n = input.nextInt();
        int[] arr = new int[n];

        // 수열의 원소 입력
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        int cnt = 0;
        
        for(int i = 0; i < n; i++) {
            boolean flag = false;
            for(int j = i; j < n - 1; j++) {
                if(arr[j] > arr[j + 1]) {
                    flag = true;
                }
            }
            if(flag) cnt++;
        }


        // 최소 횟수는 전체 길이에서 가장 긴 오름차순 부분 수열 길이를 빼면 됨
        System.out.println(n == 1 ? 0 : cnt);
    }
}
