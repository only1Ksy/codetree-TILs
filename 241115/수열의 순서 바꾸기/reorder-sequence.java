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

        int maxLength = 1;  // 가장 긴 오름차순 부분 수열의 길이
        int tempLength = 1; // 현재 오름차순 부분 수열의 길이

        // 가장 긴 오름차순 부분 수열을 찾기
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] < arr[i + 1]) {  // 오름차순일 때
                tempLength++;  // 길이를 증가시킴
            } else {  // 오름차순이 끊어졌을 때
                maxLength = Math.max(maxLength, tempLength);  // 가장 긴 오름차순 길이 갱신
                tempLength = 1;  // 새로운 오름차순 부분 수열 시작
            }
        }

        // 마지막 부분까지 확인해서 길이 갱신
        maxLength = Math.max(maxLength, tempLength);

        // 최소 횟수는 전체 길이에서 가장 긴 오름차순 수열 길이를 뺀 값
        System.out.println(n - maxLength);
    }
}
