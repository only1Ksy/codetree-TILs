import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int[] h = new int[n];
        int max = 0;

        for (int i = 0; i < n; i++){
            h[i] = input.nextInt();
            max = Math.max(max, h[i]);
        }

        int maxR = 0;

        // 빙산의 높이 설정하는 반복문
        for (int i = 1; i < max; i++){
            int cnt = 0;

            for (int j = 0; j < n; j++) {
                // 현재 빙산이 물에 잠기지 않았고, 첫 번째 빙산이거나 이전 빙산이 잠겼다면 새로운 덩어리
                    if (h[j] - i > 0 && (j == 0 || h[j - 1] - i <= 0)) {
                    cnt++;
                }
            }

            maxR = Math.max(maxR, cnt);
        }

        System.out.println(maxR);

    }
}