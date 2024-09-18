import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] p = new int[n];
        int b = input.nextInt();

        // 선물 가격 입력
        for (int i = 0; i < n; i++) {
            p[i] = input.nextInt();
        }

        int max = 0;

        // 학생들의 선물 가격을 오름차순으로 정렬
        Arrays.sort(p);

        // 각 학생에 대해 할인 적용을 시도
        for (int i = 0; i < n; i++) {
            int sum = 0;
            int count = 0;

            // 쿠폰을 적용한 가격
            sum += p[i] / 2;
            count++;

            // 나머지 학생들의 선물 가격을 더함
            for (int j = 0; j < n; j++) {
                if (i == j) continue;  // 이미 할인한 학생 제외
                if (sum + p[j] > b) break;  // 예산 초과시 종료
                sum += p[j];
                count++;
            }

            // 최대 학생 수 갱신
            max = Math.max(max, count);
        }

        System.out.println(max);
    }
}