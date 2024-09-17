import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int [] x1 = new int[n];
        int [] x2 = new int[n];

        for (int i = 0; i < n; i++){
            x1[i] = input.nextInt();
            x2[i] = input.nextInt();
        }

        int cnt = 0;

        // 검사할 선분을 하나 선택
        for (int i = 0; i < n; i++){
            // 나머지에 대해 교차하는지 검사
            boolean check = true;
            for (int j = 0; j < n; j++){
                if (i == j) continue;

                if ((x1[i] > x1[j] && x2[i] < x2[j]) ||
                    (x1[i] < x1[j] && x2[i] > x2[j]))
                    check = false;
            }
            if (check) cnt++;
        }

        System.out.println(cnt);
    }
}