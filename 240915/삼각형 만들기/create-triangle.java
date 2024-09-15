import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];

        // 좌표 입력
        for (int i = 0; i < n; i++) {
            x[i] = input.nextInt();
            y[i] = input.nextInt();
        }

        int maxArea = 0;

        // 세 점을 선택하여 삼각형을 구성
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    // x축과 y축에 평행한 변을 찾고 직사각형의 넓이 계산
                    if (x[i] == x[j] && y[i] == y[k]) {  // i와 j가 x축에, i와 k가 y축에 평행
                        int width = Math.abs(y[i] - y[j]);
                        int height = Math.abs(x[i] - x[k]);
                        maxArea = Math.max(maxArea, width * height);
                    } else if (x[i] == x[k] && y[i] == y[j]) {  // i와 k가 x축에, i와 j가 y축에 평행
                        int width = Math.abs(y[i] - y[k]);
                        int height = Math.abs(x[i] - x[j]);
                        maxArea = Math.max(maxArea, width * height);
                    } else if (x[j] == x[k] && y[j] == y[i]) {  // j와 k가 x축에, j와 i가 y축에 평행
                        int width = Math.abs(y[j] - y[k]);
                        int height = Math.abs(x[j] - x[i]);
                        maxArea = Math.max(maxArea, width * height);
                    }
                }
            }
        }

        // 결과 출력
        System.out.println(maxArea);
    }
}