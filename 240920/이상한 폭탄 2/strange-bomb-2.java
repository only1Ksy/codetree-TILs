import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int k = input.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = input.nextInt();
        }

        int max = -1;

        // 외부 루프는 모든 인덱스에서 탐색할 수 있도록 n까지
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> arr = new ArrayList<>();

            // i에서 K 거리만큼 떨어진 범위까지 탐색 (n을 넘지 않도록)
            for (int j = i; j < n && j <= i + k; j++) {
                if (arr.contains(a[j])) {
                    max = Math.max(max, a[j]); // 중복이 있으면 최대값 갱신
                }
                arr.add(a[j]);
            }
        }

        System.out.println(max);
    }
}