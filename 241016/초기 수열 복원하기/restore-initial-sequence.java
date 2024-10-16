import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] arr = new int[n - 1];
        int[] result = new int[n];

        // 인접한 원소의 합 배열 입력
        for (int i = 0; i < n - 1; i++) {
            arr[i] = input.nextInt();
        }

        // 가능한 배열 생성 (1-n까지 숫자가 한 번씩만 사전 순대로 배치)
        for (int i = 0; i < n; i++) {
            result[i] = i + 1;
        }

        boolean found = false;

        // 가능한 배열의 모든 순열을 탐색
        do {
            boolean isTrue = true;
            for (int i = 0; i < n - 1; i++) {
                if (result[i] + result[i + 1] != arr[i]) {
                    isTrue = false;
                    break;
                }
            }

            if (isTrue) {
                found = true;
                break;
            }
        } while (nextPermutation(result)); // 다음 순열로 이동

        if (found) {
            // 결과 출력
            for (int i = 0; i < n; i++) {
                System.out.print(result[i] + " ");
            }
        } else {
            System.out.println("No valid permutation found");
        }
    }

    // 배열을 사전 순으로 다음 순열로 변경하는 함수
    public static boolean nextPermutation(int[] array) {
        int i = array.length - 1;
        while (i > 0 && array[i - 1] >= array[i]) {
            i--;
        }
        if (i <= 0) {
            return false;
        }

        int j = array.length - 1;
        while (array[j] <= array[i - 1]) {
            j--;
        }

        // 두 값을 교환
        int temp = array[i - 1];
        array[i - 1] = array[j];
        array[j] = temp;

        // 뒤쪽의 수열을 뒤집음
        j = array.length - 1;
        while (i < j) {
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
        return true;
    }
}