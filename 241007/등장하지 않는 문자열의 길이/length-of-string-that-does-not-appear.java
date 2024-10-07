import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        String s = input.next();

        int min = Integer.MAX_VALUE;

        // 부분 문자열 길이를 1부터 n까지 시도
        for (int len = 1; len <= n; len++) {
            boolean found = false;  // 두 번 이상 나타나는지 확인하기 위한 플래그

            // 길이 len의 부분 문자열을 비교
            for (int i = 0; i <= n - len; i++) {
                String newS = s.substring(i, i + len);
                int cnt = 0;

                // 새로운 부분 문자열과 다른 부분을 비교
                for (int k = 0; k <= n - len; k++) {
                    String newS1 = s.substring(k, k + len);

                    if (newS.equals(newS1)) cnt++;
                }

                // 두 번 이상 나타나면 그 길이는 건너뜀
                if (cnt > 1) {
                    found = true;
                    break;
                }
            }

            // 두 번 이상 나타나지 않는 가장 작은 길이를 찾으면 종료
            if (!found) {
                min = len;
                break;
            }
        }

        System.out.println(min);
    }
}