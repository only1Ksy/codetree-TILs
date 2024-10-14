import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[15];

        // 입력 받기
        for (int i = 0; i < 15; i++) {
            arr[i] = input.nextInt();
        }

        // 배열 정렬
        Arrays.sort(arr);

        // 모든 조합을 탐색하여 A, B, C, D 찾기
        for (int i = 0; i < 15; i++) {
            for (int j = i + 1; j < 15; j++) {
                for (int k = j + 1; k < 15; k++) {
                    for (int l = k + 1; l < 15; l++) {
                        int A = arr[i];
                        int B = arr[j];
                        int C = arr[k];
                        int D = arr[l];

                        // A + B, B + C, C + D, D + A, A + C, B + D, A + B + C, A + B + D, A + C + D, B + C + D, A + B + C + D를 계산
                        int[] sums = new int[15];
                        sums[0] = A + B;
                        sums[1] = B + C;
                        sums[2] = C + D;
                        sums[3] = D + A;
                        sums[4] = A + C;
                        sums[5] = B + D;
                        sums[6] = A + B + C;
                        sums[7] = A + B + D;
                        sums[8] = A + C + D;
                        sums[9] = B + C + D;
                        sums[10] = A + B + C + D;
                        sums[11] = A;
                        sums[12] = B;
                        sums[13] = C;
                        sums[14] = D;

                        Arrays.sort(sums);

                        // 주어진 배열과 합 배열 비교
                        boolean match = true;
                        for (int m = 0; m < 15; m++) {
                            if (arr[m] != sums[m]) {
                                match = false;
                                break;
                            }
                        }

                        if (match) {
                            System.out.println(A + " " + B + " " + C + " " + D);
                            return; // 찾았으면 종료
                        }
                    }
                }
            }
        }
    }
}