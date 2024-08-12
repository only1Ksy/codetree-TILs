import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char[] arr = new char[2000];
        int[] wArr = new int[2000];  // 흰색 덧칠 횟수
        int[] bArr = new int[2000];  // 검은색 덧칠 횟수

        // 배열 초기화
        Arrays.fill(arr, ' ');  // 공백으로 초기화

        int n = input.nextInt();
        int index = 1000;

        for (int i = 0; i < n; i++) {
            int x = input.nextInt();
            String s = input.next();

            if (s.equals("R")) {
                for (int j = index; j < index + x; j++) {
                    if (arr[j] != 'G') {  // 회색이 아닌 경우만 처리
                        bArr[j]++;
                        if (bArr[j] > 1 && wArr[j] > 1) {
                            arr[j] = 'G';  // B와 W가 각각 2번 이상 칠해지면 G로 변환
                        } else if (arr[j] == ' ' || arr[j] == 'W') {
                            arr[j] = 'B';  // 초기 상태 또는 W 위에 B를 덧칠
                        }
                    }
                }
                index += x;
            } else if (s.equals("L")) {
                for (int j = index - 1; j >= index - x; j--) {
                    if (arr[j] != 'G') {  // 회색이 아닌 경우만 처리
                        wArr[j]++;
                        if (wArr[j] > 1 && bArr[j] > 1) {
                            arr[j] = 'G';  // B와 W가 각각 2번 이상 칠해지면 G로 변환
                        } else if (arr[j] == ' ' || arr[j] == 'B') {
                            arr[j] = 'W';  // 초기 상태 또는 B 위에 W를 덧칠
                        }
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