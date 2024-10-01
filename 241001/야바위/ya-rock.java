import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];

        for (int i = 0; i < n; i++){
            a[i] = input.nextInt();
            b[i] = input.nextInt();
            c[i] = input.nextInt();
        }

        int max = 0;

        // 처음 조약돌 넣을 위치 정하기
        for (int i = 1; i < 4; i++){
            int cnt = 0;

            int[] arr = new int[4];
            arr[i] = 1;

            if (i == 0){
                for (int j = 0; j < n; j++){
                    // a[j]번째랑 b[j]번째랑 교환 후 c[j]번째 확인
                    int temp = arr[a[j]];
                    arr[a[j]] = arr[b[j]];
                    arr[b[j]] = temp;

                    if (arr[c[j]] == 1) cnt++;
                }
            }
            else if (i == 1){
                for (int j = 0; j < n; j++){
                    // a[j]번째랑 b[j]번째랑 교환 후 c[j]번째 확인
                    int temp = arr[a[j]];
                    arr[a[j]] = arr[b[j]];
                    arr[b[j]] = temp;

                    if (arr[c[j]] == 1) cnt++;
                }
            }
            else {
                for (int j = 0; j < n; j++){
                    // a[j]번째랑 b[j]번째랑 교환 후 c[j]번째 확인
                    int temp = arr[a[j]];
                    arr[a[j]] = arr[b[j]];
                    arr[b[j]] = temp;

                    if (arr[c[j]] == 1) cnt++;
                }
            }

            max = Math.max(max, cnt);
        }

        System.out.println(max);
    }
}