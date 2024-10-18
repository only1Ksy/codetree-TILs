import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        Arrays.sort(arr);  // 높이를 정렬해서 범위를 쉽게 탐색

        int minCost = Integer.MAX_VALUE;

        // 1-17로 구간을 설정해서, 그 구간에서 벗어나는 요소들을
        // 비용에 포함을 시키면 된다더라
        for (int i = 0; i < 83; i++){
            int low = i;
            int high = i + 17;
            int cost = 0;

            for (int j = 0; j < n; j++){
                if (arr[j] < low){
                    cost += (low - arr[j])*(low - arr[j]);
                }
                else if (arr[j] > high){
                    cost += (arr[j] - high)*(arr[j] - high);
                }
            }

            minCost = Math.min(minCost, cost);
        }

        System.out.println(minCost);
    }
}