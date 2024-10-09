import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        String s = input.next();
        char[] arr = s.toCharArray();
        int max = 0;

        // 한 명이 추가로 들어갈 공간을 고르기
        for (int i = 0; i < n; i++){
            if (arr[i] == '1') continue;

            arr[i] = '1';
            int min = Integer.MAX_VALUE;

            for (int j = 0; j < n; j++){
                for (int k = j + 1; k < n; k++){
                    if (arr[j] == '0' || arr[k] == '0') continue;
                    // 가장 가까운 거리 구하기
                    min = Math.min(min, k - j);
                }
            }
            // 가장 가까운 거리 중 최댓값 구하기
            max = Math.max(max, min);

            arr[i] = '0';
        }

        System.out.println(max);
    }
}