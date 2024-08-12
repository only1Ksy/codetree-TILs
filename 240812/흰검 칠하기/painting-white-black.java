import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char[] arr = new char[2000];  // 타일 배열
        int[] wArr = new int[2000];   // 흰색 덧칠 횟수
        int[] bArr = new int[2000];   // 검은색 덧칠 횟수

        Arrays.fill(arr, ' ');  // 배열 초기화: 공백으로 설정

        int n = input.nextInt();
        int index = 1000;  // 중앙 위치에서 시작

        for (int i = 0; i < n; i++) {
            int x = input.nextInt();
            String s = input.next();

            if (s.equals("R")) {
                for (int j = index; j < index + x; j++) {
                    if (arr[j] == ' ') {  // 초기 상태
                        arr[j] = 'B';
                    } else if (arr[j] == 'W') {  // 흰색 위에 검은색 덧칠
                        arr[j] = 'G';
                    } else if (arr[j] == 'G') {  // 회색 상태는 변경 없음
                        continue;
                    }
                    bArr[j]++;
                    if (bArr[j] > 1 && wArr[j] > 1) {
                        arr[j] = 'G';
                    }
                }
                index += x;
            } else if (s.equals("L")) {
                for (int j = index - 1; j >= index - x; j--) {
                    if (arr[j] == ' ') {  // 초기 상태
                        arr[j] = 'W';
                    } else if (arr[j] == 'B') {  // 검은색 위에 흰색 덧칠
                        arr[j] = 'G';
                    } else if (arr[j] == 'G') {  // 회색 상태는 변경 없음
                        continue;
                    }
                    wArr[j]++;
                    if (wArr[j] > 1 && bArr[j] > 1) {
                        arr[j] = 'G';
                    }
                }
                index -= x;
            }
        }

        int wNum = 0;
        int bNum = 0;
        int gNum = 0;

        for (int i = 0; i < 2000; i++) {
            if (arr[i] == 'W') {
                wNum++;
            } else if (arr[i] == 'B') {
                bNum++;
            } else if (arr[i] == 'G') {
                gNum++;
            }
        }

        System.out.println(wNum + " " + bNum + " " + gNum);
    }
}