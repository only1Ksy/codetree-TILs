import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int k = input.nextInt();

        int[] bomb = new int[n];

        for (int i = 0; i < n; i++){
            bomb[i] = input.nextInt();
        }

        // 터질 걸 고르고 몇 번 터지는지 확인해서 최댓값을 업데이트
        int max = 0;
        int result = 0;
        for (int i = 0; i <= 1000000; i++){
            int cnt = 0;
            int preIdx = Integer.MIN_VALUE;

            for (int j = 0; j < n; j++){
                if (bomb[j] == i && j-preIdx < k){
                    cnt++; preIdx = j;
                }
                else if (bomb[j] == i){
                    preIdx = j;
                }
            }

            if (cnt >= max && cnt > 0){
                max = cnt;
                result = i;
            }
        }

        System.out.println(result);
    }
}