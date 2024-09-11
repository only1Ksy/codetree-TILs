import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] arr = new int[n];
        int[] cnt1 = new int[n];
        int[] cnt2 = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
            cnt1[i] = input.nextInt();
            cnt2[i] = input.nextInt();
        }

        int cnt = 0;

        // 1에서 9까지의 서로 다른 세 자리 수를 전부 탐색
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if (i == j) continue; // 중복 방지

                for (int k = 1; k <= 9; k++) {
                    if (i == k || j == k) continue; // 중복 방지

                    boolean isValid = true;

                    // 각 숫자 조합에 대해 주어진 모든 조건을 체크
                    for (int l = 0; l < n; l++) {
                        int hund = arr[l] / 100;
                        int ten = (arr[l] % 100) / 10;
                        int one = arr[l] % 10;

                        int cnt11 = 0, cnt22 = 0;

                        // 1번 카운트: 같은 자리, 같은 숫자
                        if (i == hund) cnt11++;
                        if (j == ten) cnt11++;
                        if (k == one) cnt11++;

                        // 2번 카운트: 다른 자리, 같은 숫자
                        if (i == ten || i == one) cnt22++;
                        if (j == hund || j == one) cnt22++;
                        if (k == hund || k == ten) cnt22++;

                        // 조건이 맞지 않으면 즉시 탈출
                        if (cnt11 != cnt1[l] || cnt22 != cnt2[l]) {
                            isValid = false;
                            break;
                        }
                    }

                    // 조건을 모두 만족하는 경우 카운트
                    if (isValid) cnt++;
                }
            }
        }

        System.out.println(cnt);
    }
}