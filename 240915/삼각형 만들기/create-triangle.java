import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[][] points = new int[n][2];

        // 좌표 입력 받기
        for (int i = 0; i < n; i++) {
            points[i][0] = input.nextInt();  // x좌표
            points[i][1] = input.nextInt();  // y좌표
        }

        int maxArea = 0;

        // 세 개의 점을 골라서 가능한 직사각형 삼각형의 넓이를 계산
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    int x1 = points[i][0], y1 = points[i][1];
                    int x2 = points[j][0], y2 = points[j][1];
                    int x3 = points[k][0], y3 = points[k][1];

                    // 삼각형의 변이 x축과 y축에 평행한지 확인하고, 넓이를 계산
                    if (x1 == x2 && y1 == y3) {  // x축과 y축에 평행한 변을 찾음
                        int area = Math.abs(x1 - x3) * Math.abs(y1 - y2);
                        maxArea = Math.max(maxArea, area);
                    } else if (x1 == x3 && y1 == y2) {
                        int area = Math.abs(x1 - x2) * Math.abs(y1 - y3);
                        maxArea = Math.max(maxArea, area);
                    } else if (x2 == x3 && y2 == y1) {
                        int area = Math.abs(x2 - x1) * Math.abs(y2 - y3);
                        maxArea = Math.max(maxArea, area);
                    }
                }
            }
        }

        // 최대 넓이에 2를 곱한 값을 출력
        System.out.println(maxArea * 2);
    }
}