import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];

        for (int i = 0; i < n; i++){
            a[i] = input.nextInt();
            b[i] = input.nextInt();
        }

        // a 가 이기는 횟수가 최대가 되도록 설정
        // 1: 가위, 2: 주먹, 3: 보
        // 1: 가위, 2: 보, 3: 주먹
        // 1: 주먹, 2: 가위, 3: 보
        // 1: 주먹, 2: 보, 3: 가위
        // 1: 보, 2: 가위, 3: 주먹
        // 1: 보, 2: 주먹, 3: 가위
        int r1 = 0, r2 = 0, r3 = 0;
        int r4 = 0, r5 = 0, r6 = 0;
        for (int i = 0; i < n; i++){
            if ((a[i] == 1 && b[i] == 3) || (a[i] == 2 && b[i] == 1) || (a[i] == 3 && b[i] == 2))
                r1++;
            if ((a[i] == 1 && b[i] == 2) || (a[i] == 2 && b[i] == 3) || (a[i] == 3 && b[i] == 1))
                r2++;
            // if ((a[i] == 1 && b[i] == 2) || (a[i] == 2 && b[i] == 3) || (a[i] == 3 && b[i] == 1))
                // r3++;
            // if ((a[i] == 1 && b[i] == 3) || (a[i] == 2 && b[i] == 1) || (a[i] == 3 && b[i] == 2))
                // r4++;
            // if ((a[i] == 1 && b[i] == 3) || (a[i] == 2 && b[i] == 1) || (a[i] == 3 && b[i] == 2))
                // r5++;
            // if ((a[i] == 1 && b[i] == 3) || (a[i] == 2 && b[i] == 1) || (a[i] == 3 && b[i] == 2))
                // r6++;
        }

        System.out.println(Math.max(r1, r2));
    }
}