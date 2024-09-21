import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int max = 0;

        for (int i = 0; i < n; i++) {
            a[i] = input.nextInt();
            b[i] = input.nextInt();
            max = Math.max(max, b[i]); // 최대 범위 설정
        }

        int cnt = 0;

        // 3개의 선분을 제거하는 조합
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    int[] arr = new int[max + 1];

                    // i, j, k 선분을 제외하고 남은 선분이 겹치는지 확인
                    for (int l = 0; l < n; l++) {
                        if (l == i || l == j || l == k) continue; // 제거된 선분

                        // 선분의 시작점과 끝점 사이에 겹침 여부 확인
                        for (int t = a[l]; t <= b[l]; t++) { // 경계에서는 닿지 않도록 '<' 사용
                            arr[t]++;
                        }
                    }

                    // 겹치는지 확인
                    boolean check = true;
                    for (int l = 0; l < max + 1; l++) {
                        if (arr[l] > 1) {
                            check = false;
                            break;
                        }
                    }

                    if (check) cnt++;
                }
            }
        }

        System.out.println(cnt);
    }
}